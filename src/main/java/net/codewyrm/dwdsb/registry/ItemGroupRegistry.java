package net.codewyrm.dwdsb.registry;

import net.codewyrm.dwdsb.util.Util;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Arrays;

import static net.codewyrm.dwdsb.registry.ItemRegistry.*;

public class ItemGroupRegistry {
    public static final ItemGroup DWDSB_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Util.ofDWDSB("dwdsb_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(DISC_CORE))
                    .displayName(Text.translatable("itemgroup.dwdsb.dwdsb_items"))
                    .entries((displayContext, entries) ->
                    {
                        for (Item item : Arrays.asList(
                                WAVE, LOST, WATCHED, REST,
                                MIRROR, RAIN, ALONE,
                                BEAN, LYRE, EMBER,
                                STAR, RAVE, WALTZ, SUNSET,
                                DISC_CORE,
                                ANCIENT_WHISTLE,
                                AMETHYST_WHISTLE,
                                GOLD_WHISTLE,
                                DIAMOND_WHISTLE,
                                EMERALD_WHISTLE,
                                MELODY_POTTERY_SHERD,
                                RECORD_POTTERY_SHERD,
                                SOLO_POTTERY_SHERD
                        )) {
                            entries.add(item);
                        }
                    })
                    .build());
    public static void registerItemGroups() {
    }
}
