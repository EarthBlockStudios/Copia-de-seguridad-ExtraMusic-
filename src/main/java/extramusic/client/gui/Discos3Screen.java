
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

import extramusic.world.inventory.Discos3Menu;

import extramusic.network.Discos3ButtonMessage;

import extramusic.SiriusrMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Discos3Screen extends AbstractContainerScreen<Discos3Menu> {
	private final static HashMap<String, Object> guistate = Discos3Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Discos3Screen(Discos3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 279;
		this.imageHeight = 152;
	}

	private static final ResourceLocation texture = new ResourceLocation("siriusr:textures/discos_3.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/discv.png"));
		this.blit(ms, this.leftPos + 15, this.topPos + 68, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/th__4_-removebg-preview_1.png"));
		this.blit(ms, this.leftPos + 39, this.topPos + 68, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/th__4_-removebg-preview_1.png"));
		this.blit(ms, this.leftPos + 39, this.topPos + 92, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/th__4_-removebg-preview_1.png"));
		this.blit(ms, this.leftPos + 39, this.topPos + 41, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/cyan_dye.png"));
		this.blit(ms, this.leftPos + 58, this.topPos + 41, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/redstone.png"));
		this.blit(ms, this.leftPos + 59, this.topPos + 68, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/gunpowder.png"));
		this.blit(ms, this.leftPos + 59, this.topPos + 93, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/lovepik_com-401234413-yellow-arrow_1.png"));
		this.blit(ms, this.leftPos + 82, this.topPos + 92, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/lovepik_com-401234413-yellow-arrow_1.png"));
		this.blit(ms, this.leftPos + 82, this.topPos + 67, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/lovepik_com-401234413-yellow-arrow_1.png"));
		this.blit(ms, this.leftPos + 81, this.topPos + 42, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/ered_1.png"));
		this.blit(ms, this.leftPos + 85, this.topPos + 26, 0, 0, 10, 10, 10, 10);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/sevnatarm.png"));
		this.blit(ms, this.leftPos + 98, this.topPos + 93, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/smlliktnspirt.png"));
		this.blit(ms, this.leftPos + 98, this.topPos + 41, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/morirodare.png"));
		this.blit(ms, this.leftPos + 98, this.topPos + 67, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "CREAR DISCOS", 17, 9, -16738048);
		this.font.draw(poseStack, "Smells Like Teen Spirit", 119, 44, -12829636);
		this.font.draw(poseStack, "Morir\uFFFD da Re", 121, 69, -12829636);
		this.font.draw(poseStack, "Seven Nation Army", 121, 95, -12829636);
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
<<<<<<< HEAD
		this.addRenderableWidget(new Button(this.leftPos + 9, this.topPos + 126, 51, 20, new TextComponent("Atr�s"), e -> {
=======
		this.addRenderableWidget(new Button(this.leftPos + 7, this.topPos + 125, 51, 20, new TextComponent("Atr�s"), e -> {
>>>>>>> branch 'master' of https://github.com/EarthBlockStudios/Extramusic.git
			if (true) {
				SiriusrMod.PACKET_HANDLER.sendToServer(new Discos3ButtonMessage(0, x, y, z));
				Discos3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 66, this.topPos + 125, 35, 20, new TextComponent("<<"), e -> {
			if (true) {
				SiriusrMod.PACKET_HANDLER.sendToServer(new Discos3ButtonMessage(1, x, y, z));
				Discos3ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 234, this.topPos + 125, 35, 20, new TextComponent(">>"), e -> {
			if (true) {
				SiriusrMod.PACKET_HANDLER.sendToServer(new Discos3ButtonMessage(2, x, y, z));
				Discos3ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
	}
}
