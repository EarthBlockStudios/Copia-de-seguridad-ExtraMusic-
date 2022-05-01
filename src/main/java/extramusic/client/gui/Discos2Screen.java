
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

import extramusic.world.inventory.Discos2Menu;

import extramusic.network.Discos2ButtonMessage;

import extramusic.SiriusrMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Discos2Screen extends AbstractContainerScreen<Discos2Menu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Discos2Screen(Discos2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 279;
		this.imageHeight = 152;
	}

	private static final ResourceLocation texture = new ResourceLocation("siriusr:textures/discos_2.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/block_of_redstone_je2_be2_1.png"));
		this.blit(ms, this.leftPos + 58, this.topPos + 41, 0, 0, 15, 15, 15, 15);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/blue_dye_je1_be1_1.png"));
		this.blit(ms, this.leftPos + 59, this.topPos + 69, 0, 0, 12, 12, 12, 12);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/tear_1.png"));
		this.blit(ms, this.leftPos + 59, this.topPos + 94, 0, 0, 12, 12, 12, 12);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/lovepik_com-401234413-yellow-arrow_1.png"));
		this.blit(ms, this.leftPos + 82, this.topPos + 92, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/lovepik_com-401234413-yellow-arrow_1.png"));
		this.blit(ms, this.leftPos + 82, this.topPos + 67, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/lovepik_com-401234413-yellow-arrow_1.png"));
		this.blit(ms, this.leftPos + 81, this.topPos + 42, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/ered_1.png"));
		this.blit(ms, this.leftPos + 85, this.topPos + 26, 0, 0, 10, 10, 10, 10);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/ea.png"));
		this.blit(ms, this.leftPos + 98, this.topPos + 91, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/tcoftck.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 41, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/enemy.png"));
		this.blit(ms, this.leftPos + 97, this.topPos + 67, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "The Court of the Crimson King", 119, 44, -12829636);
		this.font.draw(poseStack, "Enemy", 121, 69, -12829636);
		this.font.draw(poseStack, "Come together", 121, 94, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 9, this.topPos + 126, 51, 20, new TextComponent("Atrás"), e -> {
			if (true) {
				SiriusrMod.PACKET_HANDLER.sendToServer(new Discos2ButtonMessage(0, x, y, z));
				Discos2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
