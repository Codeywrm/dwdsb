package net.codewyrm.dwdsb;
import net.codewyrm.dwdsb.init.MusicInit;
import net.codewyrm.dwdsb.registry.ModItems;
import net.codewyrm.dwdsb.util.ModLootTableModifiers;
import net.codewyrm.dwdsb.util.TradeChanger;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.gui.screen.ingame.SmithingScreen;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Unique;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class MusicDiscMod implements ModInitializer {
	public static final String MOD_ID = "dwdsb";
	@Override
	public void onInitialize() {
		System.out.println("Ready for some killer beats?");
		ModItems.registerItems();
		MusicInit.registerSounds();
		ModItems.addItemsToItemGroup();
		ModLootTableModifiers.modifyLootTables();
		TradeChanger.ModifyTrades();

	}
}
