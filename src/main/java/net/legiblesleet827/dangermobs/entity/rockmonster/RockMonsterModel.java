package net.legiblesleet827.dangermobs.entity.rockmonster;

import net.legiblesleet827.dangermobs.DangerousMobsMod;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RockMonsterModel extends AnimatedGeoModel<RockMonster> {
    @Override
    public Identifier getModelLocation(RockMonster object) {
        return new Identifier(DangerousMobsMod.MOD_ID, "geo/rock_monster.geo.json");
    }

    @Override
    public Identifier getTextureLocation(RockMonster object) {
        return new Identifier(DangerousMobsMod.MOD_ID, "textures/entity/rock_monster.png");
    }

    @Override
    public Identifier getAnimationFileLocation(RockMonster animatable) {
        return new Identifier(DangerousMobsMod.MOD_ID, "animations/rock_monster.animation.json");
    }
}
