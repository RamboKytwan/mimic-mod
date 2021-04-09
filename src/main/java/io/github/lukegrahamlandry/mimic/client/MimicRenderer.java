package io.github.lukegrahamlandry.mimic.client;

import io.github.lukegrahamlandry.mimic.entities.MimicEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MimicRenderer extends GeoEntityRenderer<MimicEntity> {
    public MimicRenderer(EntityRendererManager manager){
        super(manager, new MimicModel());
    }
}
