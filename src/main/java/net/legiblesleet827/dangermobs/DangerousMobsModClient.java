package net.legiblesleet827.dangermobs;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.legiblesleet827.dangermobs.entity.rockmonster.RockMonsterRenderer;

public class DangerousMobsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(DangerousMobsMod.ROCK_MONSTER,
                (context) -> new RockMonsterRenderer(context));
    }
}
