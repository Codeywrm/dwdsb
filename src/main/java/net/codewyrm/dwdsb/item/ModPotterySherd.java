package net.codewyrm.dwdsb.item;

import net.minecraft.block.DecoratedPotPattern;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

import static net.codewyrm.dwdsb.util.Util.ofDWDSB;

public class ModPotterySherd {
    public static final RegistryKey<DecoratedPotPattern> MELODY_POTTERY_PATTERN =  of("melody");
    public static final RegistryKey<DecoratedPotPattern> RECORD_POTTERY_PATTERN =  of("record");
    public static final RegistryKey<DecoratedPotPattern> SOLO_POTTERY_PATTERN =  of("solo");


    public static void register(Registry<DecoratedPotPattern> registry, RegistryKey<DecoratedPotPattern> resourceKey, String string) {
        Registry.register(registry, resourceKey, new DecoratedPotPattern(ofDWDSB(string)));
    }

    private static RegistryKey<DecoratedPotPattern> of(String string) {
        return RegistryKey.of(RegistryKeys.DECORATED_POT_PATTERN, ofDWDSB(string));
    }
}
