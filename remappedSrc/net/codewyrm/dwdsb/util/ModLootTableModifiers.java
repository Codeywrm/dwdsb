package net.codewyrm.dwdsb.util;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

import static net.codewyrm.dwdsb.registry.ModItems.*;
import static net.codewyrm.dwdsb.util.IdentifierUtils.*;
import static net.codewyrm.dwdsb.util.Utils.equalsAny;

public class ModLootTableModifiers {
    private static final Identifier DESERT_PYRAMID_ID = ofMinecraft("chests/desert_pyramid");
    private static final Identifier END_CITY_ID = ofMinecraft("chests/end_city_treasure");
    private static final Identifier JUNGLE_TEMPLE_ID = ofMinecraft("chests/jungle_temple");
    private static final Identifier ABANDONED_MINESHAFT_ID = ofMinecraft("chests/abandoned_mineshaft");
    private static final Identifier STRONGHOLD_LIBRARY_ID = ofMinecraft("chests/stronghold_library");
    private static final Identifier IGLOO_ID = ofMinecraft("chests/igloo_chest");
    private static final Identifier PILLAGER_OUTPOST_ID = ofMinecraft("chests/pillager_outpost");
    private static final Identifier WOODLAND_MANSION = ofMinecraft("chests/woodland_mansion");
    private static final Identifier VILLAGE_CARTOGRAPHER = ofMinecraft("chests/village/village_cartographer");
    private static final Identifier VILLAGE_DESERT_HOUSE = ofMinecraft("chests/village/village_desert_house");
    private static final Identifier VILLAGE_PLAINS_HOUSE = ofMinecraft("chests/village/village_plains_house");
    private static final Identifier VILLAGE_SAVANNA_HOUSE = ofMinecraft("chests/village/village_savanna_house");
    private static final Identifier VILLAGE_SNOWY_HOUSE = ofMinecraft("chests/village/village_snowy_house");
    private static final Identifier VILLAGE_TAIGA_HOUSE = ofMinecraft("chests/village/village_taiga_house");

    private static void addToLootTable(LootTable.Builder tableBuilder, int max, Item item, float chance) {
        tableBuilder.pool(LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .conditionally(RandomChanceLootCondition.builder(chance))
                .with(ItemEntry.builder(item))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, max)).build())
                .build()
        );
    }

    private static final float GUARANTEED = 1f;

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            if (DESERT_PYRAMID_ID.equals(id)) {
                addToLootTable(tableBuilder, 1, LYRE, .1f);
                addToLootTable(tableBuilder, 1, UNREFINED_DISC_CORE, .05f);
            }
            if (END_CITY_ID.equals(id)) {
                addToLootTable(tableBuilder, 1, REST, .1f);
                addToLootTable(tableBuilder, 3, UNREFINED_DISC_CORE, .15f);
            }
            if (JUNGLE_TEMPLE_ID.equals(id)) {
                addToLootTable(tableBuilder, 1, BEAN, .3f);
                addToLootTable(tableBuilder, 2, UNREFINED_DISC_CORE, .1f);
            }
            if (ABANDONED_MINESHAFT_ID.equals(id)) {
                addToLootTable(tableBuilder, 1, ALONE, .2f);
                addToLootTable(tableBuilder, 1, UNREFINED_DISC_CORE, .1f);
            }
            if (STRONGHOLD_LIBRARY_ID.equals(id)) {
                addToLootTable(tableBuilder, 1, WATCHED, GUARANTEED);
            }
            if (IGLOO_ID.equals(id)) {
                addToLootTable(tableBuilder, 1, STAR, GUARANTEED);
            }
            if (PILLAGER_OUTPOST_ID.equals(id)) {
                addToLootTable(tableBuilder, 1, RAVE, .5f);
            }
            if (WOODLAND_MANSION.equals(id)) {
                addToLootTable(tableBuilder, 1, WALTZ, .3f);
            }
            if (VILLAGE_CARTOGRAPHER.equals(id)) {
                addToLootTable(tableBuilder, 1, SUNSET, .5f);
            }
            if (equalsAny(id,
                    VILLAGE_DESERT_HOUSE,
                    VILLAGE_PLAINS_HOUSE,
                    VILLAGE_SAVANNA_HOUSE,
                    VILLAGE_SNOWY_HOUSE,
                    VILLAGE_TAIGA_HOUSE
            )) {
                addToLootTable(tableBuilder, 1, SUNSET, .1f);
            }

// Adds items to Sus blocks.
            if (LootTables.TRAIL_RUINS_COMMON_ARCHAEOLOGY.equals(id)) {
                Map<Item, Integer> itemWeights = new HashMap<>();
                itemWeights.put(UNREFINED_DISC_CORE, 2);
                itemWeights.put(ANCIENT_WHISTLE, 2);
                itemWeights.put(MELODY_POTTERY_SHERD, 6);
                itemWeights.forEach((item, weight) ->
                        tableBuilder.modifyPools((poolBuilder) ->
                                poolBuilder.with(ItemEntry.builder(item).weight(weight))
                        )
                );
            }
        });
    }
}