package net.legiblesleet827.dangermobs.entity.rockmonster;

import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RockMonsterRenderer extends GeoEntityRenderer<RockMonster> {
    public RockMonsterRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new RockMonsterModel());
        this.shadowRadius = 3;
    }

    @Override
    protected float getDeathMaxRotation(RockMonster entityLivingBaseIn) {
        return 0.0f;
    }
}
