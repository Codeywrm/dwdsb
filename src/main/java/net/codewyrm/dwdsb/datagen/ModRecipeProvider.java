package net.codewyrm.dwdsb.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static net.codewyrm.dwdsb.registry.ItemRegistry.*;
import static net.minecraft.item.Items.*;
import static net.minecraft.recipe.Ingredient.ofItem;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {

        return new RecipeGenerator(registries, exporter) {

            private void generateDiscRecipe(Item disc, Item addition) {
                SmithingTransformRecipeJsonBuilder
                        .create(ofItem(DISC_CORE), ofItem(NETHERITE_SCRAP), ofItem(addition), RecipeCategory.TOOLS, disc)
                        .criterion(hasItem(DISC_CORE), conditionsFromItem(DISC_CORE))
                        .offerTo(exporter, getRecipeName(disc) + "_smithing");
            }

            private void generateWhistleRecipe(Item whistle, Item addition) {
                SmithingTransformRecipeJsonBuilder
                        .create(ofItem(ANCIENT_WHISTLE), ofItem(COPPER_INGOT), ofItem(addition), RecipeCategory.TOOLS, whistle)
                        .criterion(hasItem(ANCIENT_WHISTLE), conditionsFromItem(ANCIENT_WHISTLE))
                        .offerTo(exporter, getRecipeName(whistle) + "_smithing");
            }

            @Override
            public void generate() {
                generateDiscRecipe(WAVE, PRISMARINE_SHARD);
                generateDiscRecipe(LOST, ECHO_SHARD);
                generateDiscRecipe(MIRROR, AMETHYST_SHARD);
                generateDiscRecipe(RAIN, GLOW_BERRIES);
                generateDiscRecipe(EMBER, NETHERITE_INGOT);

                generateWhistleRecipe(AMETHYST_WHISTLE, AMETHYST_SHARD);
                generateWhistleRecipe(GOLD_WHISTLE, GOLD_INGOT);
                generateWhistleRecipe(DIAMOND_WHISTLE, DIAMOND);
                generateWhistleRecipe(EMERALD_WHISTLE, EMERALD);
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}