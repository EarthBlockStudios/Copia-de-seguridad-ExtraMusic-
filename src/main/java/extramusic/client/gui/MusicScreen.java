
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

import extramusic.world.inventory.MusicMenu;

import extramusic.network.MusicButtonMessage;

import extramusic.SiriusrMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MusicScreen extends AbstractContainerScreen<MusicMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MusicScreen(MusicMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 279;
		this.imageHeight = 152;
	}

	private static final ResourceLocation texture = new ResourceLocation("siriusr:textures/music.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/em.png"));
		this.blit(ms, this.leftPos + 8, this.topPos + 125, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/gui1.png"));
		this.blit(ms, this.leftPos + 8, this.topPos + 44, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/logotipo1_copia_1.png"));
		this.blit(ms, this.leftPos + 176, this.topPos + 50, 0, 0, 80, 80, 80, 80);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/ea.png"));
		this.blit(ms, this.leftPos + 8, this.topPos + 98, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/ered_1.png"));
		this.blit(ms, this.leftPos + 7, this.topPos + 70, 0, 0, 20, 20, 20, 20);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/logotipo2_copia_1.png"));
		this.blit(ms, this.leftPos + 37, this.topPos + 2, 0, 0, 192, 40, 192, 40);

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
		this.addRenderableWidget(new Button(this.leftPos + 31, this.topPos + 70, 113, 20, new TextComponent("Estudio de música"), e -> {
			if (true) {
				SiriusrMod.PACKET_HANDLER.sendToServer(new MusicButtonMessage(0, x, y, z));
				MusicButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 31, this.topPos + 96, 56, 20, new TextComponent("Discos"), e -> {
			if (true) {
				SiriusrMod.PACKET_HANDLER.sendToServer(new MusicButtonMessage(1, x, y, z));
				MusicButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 31, this.topPos + 42, 82, 20, new TextComponent("Disco Vacío"), e -> {
			if (true) {
				SiriusrMod.PACKET_HANDLER.sendToServer(new MusicButtonMessage(2, x, y, z));
				MusicButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 30, this.topPos + 124, 56, 20, new TextComponent("Bardos"), e -> {
			if (true) {
				SiriusrMod.PACKET_HANDLER.sendToServer(new MusicButtonMessage(3, x, y, z));
				MusicButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
