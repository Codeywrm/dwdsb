package net.codewyrm.dwdsb.registry;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static net.codewyrm.dwdsb.Dwdsb.MOD_ID;

public class SoundRegistry {

/*
    REGISTER SOUNDEVENTS
*/
    public static final SoundEvent WAVE_SOUND_EVENT = registerSoundEvent("wave");
    public static final SoundEvent LOST_SOUND_EVENT = registerSoundEvent("lost");
    public static final SoundEvent WATCHED_SOUND_EVENT = registerSoundEvent("watched");
    public static final SoundEvent REST_SOUND_EVENT = registerSoundEvent("rest");

    public static final SoundEvent MIRROR_SOUND_EVENT = registerSoundEvent("mirror");
    public static final SoundEvent RAIN_SOUND_EVENT = registerSoundEvent("rain");
    public static final SoundEvent ALONE_SOUND_EVENT = registerSoundEvent("alone");

    public static final SoundEvent BEAN_SOUND_EVENT = registerSoundEvent("bean");
    public static final SoundEvent LYRE_SOUND_EVENT = registerSoundEvent("lyre");
    public static final SoundEvent EMBER_SOUND_EVENT = registerSoundEvent("ember");

    public static final SoundEvent STAR_SOUND_EVENT = registerSoundEvent("star");
    public static final SoundEvent RAVE_SOUND_EVENT = registerSoundEvent("rave");
    public static final SoundEvent WALTZ_SOUND_EVENT = registerSoundEvent("waltz");
    public static final SoundEvent SUNSET_SOUND_EVENT = registerSoundEvent("sunset");

    public static final SoundEvent ANCIENT_JINGLE_SOUND_EVENT = registerSoundEvent("ancient_jingle");
    public static final SoundEvent AMETHYST_JINGLE_SOUND_EVENT = registerSoundEvent("amethyst_jingle");
    public static final SoundEvent GOLD_JINGLE_SOUND_EVENT = registerSoundEvent("gold_jingle");
    public static final SoundEvent DIAMOND_JINGLE_SOUND_EVENT = registerSoundEvent("diamond_jingle");
    public static final SoundEvent EMERALD_JINGLE_SOUND_EVENT = registerSoundEvent("emerald_jingle");

/*
    REGISTER KEYS
*/
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

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registersounds() {
    }
}
