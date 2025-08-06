package net.itzbnny.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.itzbnny.tutorialmod.block.ModBlocks;
import net.itzbnny.tutorialmod.block.entity.ModBlockEntities;
import net.itzbnny.tutorialmod.entity.ModEntities;
import net.itzbnny.tutorialmod.entity.custom.PorcupineEntity;
import net.itzbnny.tutorialmod.item.ModItemGroups;
import net.itzbnny.tutorialmod.item.ModItems;
import net.itzbnny.tutorialmod.screen.ModScreenHandlers;
import net.itzbnny.tutorialmod.sound.ModSounds;
import net.itzbnny.tutorialmod.util.ModCustomTrades;
import net.itzbnny.tutorialmod.util.ModLootTableModifiers;
import net.itzbnny.tutorialmod.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();

		ModVillagers.registerVillagers();
		ModSounds.registerSounds();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());
	}
}