package net.codewyrm.dwdsb;
import net.codewyrm.dwdsb.init.MusicInit;
import net.codewyrm.dwdsb.registry.ModItems;
//import codewyrm.dwdsb.util.ModLootTableModifiers;
import net.codewyrm.dwdsb.util.TradeChanger;
import net.fabricmc.api.ModInitializer;

public class MusicDiscMod implements ModInitializer {
	public static final String MOD_ID = "dwdsb";
	@Override
	public void onInitialize() {
		System.out.println("Ready for some killer beats?");
		ModItems.registerItems();
		MusicInit.registerSounds();
		ModItems.addItemsToItemGroup();
	//	ModLootTableModifiers.modifyLootTables();
		TradeChanger.ModifyTrades();
	}
}
