
package extramusic.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

import extramusic.world.inventory.MusicMenu;

import extramusic.procedures.Pag1amsProcedure;
import extramusic.procedures.AidiomaProcedure;
import extramusic.procedures.AdiscosProcedure;
import extramusic.procedures.AbardProcedure;
import extramusic.procedures.ADVProcedure;

import extramusic.SiriusrMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MusicButtonMessage {
	private final int buttonID, x, y, z;

	public MusicButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MusicButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MusicButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MusicButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = MusicMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			Pag1amsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			AdiscosProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			ADVProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			AbardProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			AidiomaProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		SiriusrMod.addNetworkMessage(MusicButtonMessage.class, MusicButtonMessage::buffer, MusicButtonMessage::new, MusicButtonMessage::handler);
	}
}
