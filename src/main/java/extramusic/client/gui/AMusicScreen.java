
package extramusic.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import extramusic.world.inventory.AMusicMenu;

import extramusic.network.SiriusrModVariables;
import extramusic.network.AMusicButtonMessage;

import extramusic.SiriusrMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AMusicScreen extends AbstractContainerScreen<AMusicMenu> {
	private final static HashMap<String, Object> guistate = AMusicMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AMusicScreen(AMusicMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 279;
		this.imageHeight = 152;
	}

	private static final ResourceLocation texture = new ResourceLocation("siriusr:textures/a_music.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/2022-04-23_8_1.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 23, 0, 0, 180, 84, 180, 84);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "BARDOS", 19, 9, -16738048);
<<<<<<< HEAD
		this.font.draw(poseStack, "Los bardos son entidades que te intercambiar\uFFFDn", 11, 102, -12829636);
		this.font.draw(poseStack, "5 esmeraldas por un disco de m\uFFFDsica o 5 de hierro", 11, 114, -12829636);
=======
		this.font.draw(poseStack, "" + ((entity.getCapability(SiriusrModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new SiriusrModVariables.PlayerVariables())).Bard1) + "", 11, 102, -12829636);
		this.font.draw(poseStack, "" + ((entity.getCapability(SiriusrModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new SiriusrModVariables.PlayerVariables())).bard2) + "", 11, 114, -12829636);
>>>>>>> branch 'master' of https://github.com/EarthBlockStudios/Extramusic.git
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 9, this.topPos + 127, 51, 20, new TextComponent("Atr�s"), e -> {
			if (true) {
				SiriusrMod.PACKET_HANDLER.sendToServer(new AMusicButtonMessage(0, x, y, z));
				AMusicButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
