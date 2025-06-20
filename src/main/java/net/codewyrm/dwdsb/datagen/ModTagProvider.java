package net.codewyrm.dwdsb.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

import static net.codewyrm.dwdsb.registry.ItemRegistry.*;
import static net.codewyrm.dwdsb.registry.TagRegistry.*;
import static net.minecraft.item.Items.*;

public class ModTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(VANILLA_DISCS)
                .add(
                        MUSIC_DISC_OTHERSIDE, MUSIC_DISC_5,
                        MUSIC_DISC_PIGSTEP, MUSIC_DISC_RELIC,
                        MUSIC_DISC_CREATOR, MUSIC_DISC_CREATOR_MUSIC_BOX,
                        MUSIC_DISC_PRECIPICE
                )
                .addOptionalTag(ItemTags.CREEPER_DROP_MUSIC_DISCS);

        valueLookupBuilder(MOD_DISCS)
                .add(
                        WAVE, LOST, WATCHED, REST,
                        MIRROR, RAIN, ALONE,
                        BEAN, LYRE, EMBER,
                        STAR, RAVE, WALTZ, SUNSET
                );

        valueLookupBuilder(WHISTLES)
                .add(
                        ANCIENT_WHISTLE,
                        AMETHYST_WHISTLE, GOLD_WHISTLE,
                        DIAMOND_WHISTLE, EMERALD_WHISTLE);

        valueLookupBuilder(ItemTags.DECORATED_POT_SHERDS)
                .add(MELODY_POTTERY_SHERD, RECORD_POTTERY_SHERD, SOLO_POTTERY_SHERD);

        valueLookupBuilder(ROOT_ITEMS)
                .add(
                        NOTE_BLOCK, JUKEBOX,
                        GOAT_HORN, BELL,
                        DISC_CORE,
                        MELODY_POTTERY_SHERD, RECORD_POTTERY_SHERD, SOLO_POTTERY_SHERD
                )
                .addOptionalTag(VANILLA_DISCS)
                .addOptionalTag(MOD_DISCS)
                .addOptionalTag(WHISTLES);
    }
}