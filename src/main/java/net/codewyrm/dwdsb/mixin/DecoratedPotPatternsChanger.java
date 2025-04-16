package net.codewyrm.dwdsb.mixin;

import net.codewyrm.dwdsb.item.ModPotterySherd;
import net.codewyrm.dwdsb.registry.ItemRegistry;
import net.minecraft.block.DecoratedPotPattern;
import net.minecraft.block.DecoratedPotPatterns;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DecoratedPotPatterns.class)
public class DecoratedPotPatternsChanger {

	@Inject(method = "fromSherd", at = @At("HEAD"), cancellable = true)
	private static void fromSherd(Item item, CallbackInfoReturnable<RegistryKey<DecoratedPotPattern>> cir) {
		if (item == ItemRegistry.MELODY_POTTERY_SHERD) {
			cir.setReturnValue(ModPotterySherd.MELODY_POTTERY_PATTERN);
		}
		if (item == ItemRegistry.RECORD_POTTERY_SHERD) {
			cir.setReturnValue(ModPotterySherd.RECORD_POTTERY_PATTERN);
		}
		if (item == ItemRegistry.SOLO_POTTERY_SHERD) {
			cir.setReturnValue(ModPotterySherd.SOLO_POTTERY_PATTERN);
		}
	}

	@Inject(method = "registerAndGetDefault", at = @At("TAIL"))
	private static void registerAndGetDefault(Registry<DecoratedPotPattern> registry, CallbackInfoReturnable<String> cir) {
		ModPotterySherd.register(registry, ModPotterySherd.MELODY_POTTERY_PATTERN, "melody_pottery_pattern");
		ModPotterySherd.register(registry, ModPotterySherd.RECORD_POTTERY_PATTERN, "record_pottery_pattern");
		ModPotterySherd.register(registry, ModPotterySherd.SOLO_POTTERY_PATTERN, "solo_pottery_pattern");
	}
}
