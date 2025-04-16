package net.codewyrm.dwdsb.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

import static net.codewyrm.dwdsb.registry.ItemRegistry.*;
import static net.minecraft.client.data.Models.*;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(DISC_CORE, GENERATED);

        itemModelGenerator.register(MELODY_POTTERY_SHERD, GENERATED);
        itemModelGenerator.register(RECORD_POTTERY_SHERD, GENERATED);
        itemModelGenerator.register(SOLO_POTTERY_SHERD, GENERATED);

        itemModelGenerator.registerWithInHandModel(ANCIENT_WHISTLE);
        itemModelGenerator.registerWithInHandModel(AMETHYST_WHISTLE);
        itemModelGenerator.registerWithInHandModel(GOLD_WHISTLE);
        itemModelGenerator.registerWithInHandModel(DIAMOND_WHISTLE);
        itemModelGenerator.registerWithInHandModel(EMERALD_WHISTLE);

        itemModelGenerator.register(WAVE, GENERATED);
        itemModelGenerator.register(LOST, GENERATED);
        itemModelGenerator.register(WATCHED, GENERATED);
        itemModelGenerator.register(REST, GENERATED);

        itemModelGenerator.register(MIRROR, GENERATED);
        itemModelGenerator.register(RAIN, GENERATED);
        itemModelGenerator.register(ALONE, GENERATED);

        itemModelGenerator.register(BEAN, GENERATED);
        itemModelGenerator.register(LYRE, GENERATED);
        itemModelGenerator.register(EMBER, GENERATED);

        itemModelGenerator.register(STAR, GENERATED);
        itemModelGenerator.register(RAVE, GENERATED);
        itemModelGenerator.register(WALTZ, GENERATED);
        itemModelGenerator.register(SUNSET, GENERATED);
    }
}
