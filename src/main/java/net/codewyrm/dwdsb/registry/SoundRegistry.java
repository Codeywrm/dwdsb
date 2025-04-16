package net.codewyrm.dwdsb.registry;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static net.codewyrm.dwdsb.Dwdsb.MOD_ID;

public class SoundRegistry {

// Registers SoundEvents
    public static final SoundEvent WAVE = registerSoundEvent("wave");
    public static final SoundEvent LOST = registerSoundEvent("lost");
    public static final SoundEvent WATCHED = registerSoundEvent("watched");
    public static final SoundEvent REST = registerSoundEvent("rest");

    public static final SoundEvent MIRROR = registerSoundEvent("mirror");
    public static final SoundEvent RAIN = registerSoundEvent("rain");
    public static final SoundEvent ALONE = registerSoundEvent("alone");

    public static final SoundEvent BEAN = registerSoundEvent("bean");
    public static final SoundEvent LYRE = registerSoundEvent("lyre");
    public static final SoundEvent EMBER = registerSoundEvent("ember");

    public static final SoundEvent STAR = registerSoundEvent("star");
    public static final SoundEvent RAVE = registerSoundEvent("rave");
    public static final SoundEvent WALTZ = registerSoundEvent("waltz");
    public static final SoundEvent SUNSET = registerSoundEvent("sunset");

    public static final SoundEvent ANCIENT_JINGLE = registerSoundEvent("ancient_jingle");
    public static final SoundEvent AMETHYST_JINGLE = registerSoundEvent("amethyst_jingle");
    public static final SoundEvent GOLD_JINGLE = registerSoundEvent("gold_jingle");
    public static final SoundEvent DIAMOND_JINGLE = registerSoundEvent("diamond_jingle");
    public static final SoundEvent EMERALD_JINGLE = registerSoundEvent("emerald_jingle");

// Registers Keys
    public static final Identifier WAVE_SOUND_KEY = Identifier.of("dwdsb:wave");
    public static final Identifier LOST_SOUND_KEY = Identifier.of("dwdsb:lost");
    public static final Identifier WATCHED_SOUND_KEY = Identifier.of("dwdsb:watched");
    public static final Identifier REST_SOUND_KEY = Identifier.of("dwdsb:rest");

    public static final Identifier MIRROR_SOUND_KEY = Identifier.of("dwdsb:mirror");
    public static final Identifier RAIN_SOUND_KEY = Identifier.of("dwdsb:rain");
    public static final Identifier ALONE_SOUND_KEY = Identifier.of("dwdsb:alone");

    public static final Identifier BEAN_SOUND_KEY = Identifier.of("dwdsb:bean");
    public static final Identifier LYRE_SOUND_KEY = Identifier.of("dwdsb:lyre");
    public static final Identifier EMBER_SOUND_KEY = Identifier.of("dwdsb:ember");

    public static final Identifier STAR_SOUND_KEY = Identifier.of("dwdsb:star");
    public static final Identifier RAVE_SOUND_KEY = Identifier.of("dwdsb:rave");
    public static final Identifier WALTZ_SOUND_KEY = Identifier.of("dwdsb:waltz");
    public static final Identifier SUNSET_SOUND_KEY = Identifier.of("dwdsb:sunset");

    public static final Identifier ANCIENT_JINGLE_SOUND_KEY = Identifier.of("dwdsb:ancient_jingle");
    public static final Identifier AMETHYST_JINGLE_SOUND_KEY = Identifier.of("dwdsb:amethyst_jingle");
    public static final Identifier GOLD_JINGLE_SOUND_KEY = Identifier.of("dwdsb:gold_jingle");
    public static final Identifier DIAMOND_JINGLE_SOUND_KEY = Identifier.of("dwdsb:diamond_jingle");
    public static final Identifier EMERALD_JINGLE_SOUND_KEY = Identifier.of("dwdsb:emerald_jingle");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registersounds() {
    }
}
