package net.codewyrm.dwdsb.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;

import static net.codewyrm.dwdsb.registry.ItemRegistry.ANCIENT_WHISTLE;
import static net.codewyrm.dwdsb.registry.ItemRegistry.DISC_CORE;
import static net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper.WanderingTraderOffersBuilder.SELL_COMMON_ITEMS_POOL;
import static net.minecraft.item.Items.EMERALD;

public class TradeModifier {
    public static void ModifyTrades() {
        TradeOfferHelper.registerWanderingTraderOffers(factories -> {
            factories.addOffersToPool(SELL_COMMON_ITEMS_POOL,(entity, random) -> new TradeOffer(
                    new TradedItem(EMERALD, 14),
                    new ItemStack(DISC_CORE, 1),
                    1, 10, 0.075f
            ));
            factories.addOffersToPool(SELL_COMMON_ITEMS_POOL,(entity, random) -> new TradeOffer(
                    new TradedItem(EMERALD, 26),
                    new ItemStack(ANCIENT_WHISTLE, 1),
                    1, 10, 0.075f
            ));
        });
    }
}



