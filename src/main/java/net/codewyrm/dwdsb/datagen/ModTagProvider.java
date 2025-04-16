package net.codewyrm.dwdsb.datagen;

import net.codewyrm.dwdsb.registry.TagRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

import static net.codewyrm.dwdsb.registry.ItemRegistry.*;
import static net.codewyrm.dwdsb.registry.TagRegistry.*;

public class ModTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(TagRegistry.VANILLA_DISCS)
                .addOptionalTag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(Items.MUSIC_DISC_OTHERSIDE)
                .add(Items.MUSIC_DISC_5)
                .add(Items.MUSIC_DISC_PIGSTEP)
                .add(Items.MUSIC_DISC_RELIC)
                .add(Items.MUSIC_DISC_CREATOR)
                .add(Items.MUSIC_DISC_CREATOR_MUSIC_BOX)
                .add(Items.MUSIC_DISC_PRECIPICE);

        getOrCreateTagBuilder(MOD_DISCS)
                .add(WAVE).add(LOST).add(WATCHED).add(REST)
                .add(MIRROR).add(RAIN).add(ALONE)
                .add(BEAN).add(LYRE).add(EMBER)
                .add(STAR).add(RAVE).add(WALTZ).add(SUNSET);

        getOrCreateTagBuilder(WHISTLES)
                .add(ANCIENT_WHISTLE)
                .add(AMETHYST_WHISTLE)
                .add(GOLD_WHISTLE)
                .add(DIAMOND_WHISTLE)
                .add(EMERALD_WHISTLE);

        getOrCreateTagBuilder(ROOT_ITEMS)
                .addOptionalTag(VANILLA_DISCS)
                .addOptionalTag(MOD_DISCS)
                .addOptionalTag(WHISTLES)
                .add(Items.NOTE_BLOCK)
                .add(Items.JUKEBOX)
                .add(Items.GOAT_HORN)
                .add(Items.BELL)
                .add(DISC_CORE)
                .add(MELODY_POTTERY_SHERD)
                .add(RECORD_POTTERY_SHERD)
                .add(SOLO_POTTERY_SHERD);

        getOrCreateTagBuilder(ItemTags.DECORATED_POT_SHERDS)
                .add(MELODY_POTTERY_SHERD)
                .add(RECORD_POTTERY_SHERD)
                .add(SOLO_POTTERY_SHERD);
    }
}
