package net.codewyrm.dwdsb.util;

import net.codewyrm.dwdsb.registry.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;

import static net.minecraft.item.Items.EMERALD;

public class TradeChanger {
    public static void ModifyTrades() {
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMERALD,7),
                            new ItemStack(ModItems.UNREFINED_DISC_CORE, 1),
                            1, 10, 0.075f));
                });
    }
}
