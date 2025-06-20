package net.codewyrm.dwdsb;

import net.codewyrm.dwdsb.datagen.ModModelProvider;
import net.codewyrm.dwdsb.datagen.ModRecipeProvider;
import net.codewyrm.dwdsb.datagen.ModTagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DwdsbDataGenerator implements DataGeneratorEntrypoint {

	private static final Logger LOGGER = LoggerFactory.getLogger("DWDSB DataGen");

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		LOGGER.info("[1/3] All models created.");

		pack.addProvider(ModRecipeProvider::new);
		LOGGER.info("[2/3] All recipes created.");

		pack.addProvider(ModTagProvider::new);
		LOGGER.info("[3/3] All tags created.");

		LOGGER.info("All data generated.");
	}
}