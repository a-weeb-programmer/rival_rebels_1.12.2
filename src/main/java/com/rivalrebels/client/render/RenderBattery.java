package com.rivalrebels.client.render;

import com.rivalrebels.RivalRebels;
import com.rivalrebels.client.objloaders.ModelFromObj;
import com.rivalrebels.client.oldstuff.AdvancedModelLoader;
import com.rivalrebels.client.oldstuff.IModelCustom;
import com.rivalrebels.client.renderhelper.ItemRenderBase;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderBattery extends ItemRenderBase {
    //i couldn't use the ModelFromObj since it blacks out the texture for some reason, but this is just as effective
    public static IModelCustom battery;
    public static ResourceLocation texture = new ResourceLocation(RivalRebels.modid, "textures/models/battery.png");
    public RenderBattery() {
        battery = AdvancedModelLoader.loadModel(new ResourceLocation(RivalRebels.modid, "models/obj/battery.obj"));
    }

    @Override
    public void renderByItem(ItemStack item) {
        if(type != ItemCameraTransforms.TransformType.GUI){
            Minecraft.getMinecraft().renderEngine.bindTexture(texture);
            GL11.glPushMatrix();
            GlStateManager.enableLighting();
            GL11.glPushMatrix();
            GL11.glTranslatef(0.8f, 0.3f, 0.5f);
            GL11.glRotatef(35, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(90, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(0.3f, 0.3f, 0.3f);

            battery.renderAll();

            GL11.glPopMatrix();
            GL11.glPopMatrix();
        } else {
            GL11.glPushMatrix();
            GL11.glTranslated(0.5, 0.5, 0.5);
            Minecraft.getMinecraft().getRenderItem().renderItem(item, model);
            GL11.glPopMatrix();
        }
    }
}
