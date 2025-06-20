package net.codewyrm.dwdsb;

import net.codewyrm.dwdsb.registry.ItemGroupRegistry;
import net.codewyrm.dwdsb.registry.ItemRegistry;
import net.codewyrm.dwdsb.registry.SoundRegistry;
import net.codewyrm.dwdsb.util.LootTableModifier;
import net.codewyrm.dwdsb.util.TradeModifier;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dwdsb implements ModInitializer {
	public static final String MOD_ID = "dwdsb";
	public static final Logger LOGGER = LoggerFactory.getLogger("DWDSB");

	@Override
	public void onInitialize() {
		ItemRegistry.registerItems();
		LOGGER.info("[1/5] Registered items successfully!");

		SoundRegistry.registersounds();
		LOGGER.info("[2/5] Registered sounds successfully!");

		LootTableModifier.modifyLootTables();
		LOGGER.info("[3/5] Loot tables modified successfully!");

		TradeModifier.ModifyTrades();
		LOGGER.info("[4/5] Trades modified successfully!");

		ItemGroupRegistry.registerItemGroups();
		LOGGER.info("[5/5] Registered Item Group successfully!");

        LOGGER.info("All content loaded. Ready for some killer beats?");
	}
}