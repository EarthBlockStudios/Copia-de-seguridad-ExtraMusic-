
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

import extramusic.world.inventory.GUIindexMenu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GUIindexScreen extends AbstractContainerScreen<GUIindexMenu> {
	private final static HashMap<String, Object> guistate = GUIindexMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GUIindexScreen(GUIindexMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("siriusr:textures/gu_iindex.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("siriusr:textures/logotipo2_copia_1.png"));
		this.blit(ms, this.leftPos + 49, this.topPos + 5, 0, 0, 96, 20, 96, 20);

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
		this.addRenderableWidget(new Button(this.leftPos + 31, this.topPos + 32, 130, 20, new TextComponent("Recetas"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 31, this.topPos + 57, 130, 20, new TextComponent("Canciones"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 31, this.topPos + 82, 130, 20, new TextComponent("Mesas de trabajo"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 31, this.topPos + 108, 130, 20, new TextComponent("Información"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 67, this.topPos + 137, 61, 20, new TextComponent("Idiomas"), e -> {
		}));
	}
}
