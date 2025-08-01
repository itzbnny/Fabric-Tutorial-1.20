package net.itzbnny.tutorialmod.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.itzbnny.tutorialmod.block.ModBlocks;
import net.itzbnny.tutorialmod.item.ModItems;
import net.itzbnny.tutorialmod.villager.ModVillagers;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> {
                            factories.add((entity, random) -> new TradeOffer(
                                    new ItemStack(Items.DIAMOND, 2),
                                    new ItemStack(ModItems.TOMATO, 7),
                                    6, 5, 0.05f));
                            factories.add((entity, random) -> new TradeOffer(
                                    new ItemStack(Items.DIAMOND, 7),
                                    new ItemStack(ModItems.TOMATO_SEEDS, 1),
                                    2, 7, 0.075f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> {
                            factories.add((entity, random) -> new TradeOffer(
                                    new ItemStack(Items.GOLD_INGOT, 2),
                                    new ItemStack(ModItems.CORN, 7),
                                    6, 5, 0.05f));
                            factories.add((entity, random) -> new TradeOffer(
                                    new ItemStack(Items.GOLD_INGOT, 7),
                                    new ItemStack(ModItems.CORN_SEEDS, 1),
                                    2, 7, 0.075f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                            factories.add((entity, random) -> new TradeOffer(
                                    new ItemStack(ModItems.RUBY, 32),
                                    new ItemStack(ModItems.METAL_DETECTOR, 1),
                                    2, 8, 0.075f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RUBY, 64),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SHARPNESS, 5)),
                            1, 10, 0.10f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CORN, 32),
                            new ItemStack(ModBlocks.SOUND_BLOCK, 2),
                            5, 10, 0.10f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RUBY, 32),
                            new ItemStack(ModItems.RUBY_STAFF, 1),
                            1, 10, 0.10f));
                });

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RUBY, 1),
                            new ItemStack(ModItems.COAL_BRIQUETTE, 16),
                            20, 2, 0.05f));
                });
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RUBY, 16),
                            new ItemStack(ModItems.METAL_DETECTOR, 1),
                            1, 8, 0.075f));
                });
    }
}
