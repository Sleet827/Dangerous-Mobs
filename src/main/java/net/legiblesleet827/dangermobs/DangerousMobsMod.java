package net.legiblesleet827.dangermobs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.legiblesleet827.dangermobs.entity.rockmonster.RockMonster;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib3.GeckoLib;

public class DangerousMobsMod implements ModInitializer {
	public static final String MOD_ID = "dangermobs";

	public static final EntityType<RockMonster> ROCK_MONSTER = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MOD_ID, "rock_monster"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, RockMonster::new).dimensions(EntityDimensions.fixed(7, 8)).build()
	);

	@Override
	public void onInitialize() {
		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(ROCK_MONSTER, RockMonster.createRockMonsterAttributes());
	}
}
