package net.codewyrm.dwdsb.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.item.Item;

import java.util.Arrays;

import static net.codewyrm.dwdsb.registry.ItemRegistry.*;
import static net.minecraft.client.data.Models.GENERATED;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        for (Item item : Arrays.asList(
                DISC_CORE, WAVE, LOST, WATCHED, REST,
                MIRROR, RAIN, ALONE, BEAN, LYRE,
                EMBER, STAR, RAVE, WALTZ, SUNSET,
                MELODY_POTTERY_SHERD,
                RECORD_POTTERY_SHERD,
                SOLO_POTTERY_SHERD
        ))
            itemModelGenerator.register(item, GENERATED);

        for (Item item_hand : Arrays.asList(
                ANCIENT_WHISTLE, AMETHYST_WHISTLE, GOLD_WHISTLE,
                DIAMOND_WHISTLE, EMERALD_WHISTLE
        ))
            itemModelGenerator.registerWithInHandModel(item_hand);
    }
}