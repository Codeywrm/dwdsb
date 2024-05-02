package net.codewyrm.dwdsb.init;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import static net.minecraft.registry.Registry.register;
import static net.minecraft.registry.Registries.*;
public class MusicInit {
// Discs Where Discs Shouldn't Be
    public static final Identifier WAVE_SOUND_ID = new Identifier("dwdsb:wave");
    public static final SoundEvent MUSIC_DISC_WAVE = SoundEvent.of(WAVE_SOUND_ID);

    public static final Identifier LOST_SOUND_ID = new Identifier("dwdsb:lost");
    public static final SoundEvent MUSIC_DISC_LOST = SoundEvent.of(LOST_SOUND_ID);

    public static final Identifier WATCHED_SOUND_ID = new Identifier("dwdsb:watched");
    public static final SoundEvent MUSIC_DISC_WATCHED = SoundEvent.of(WATCHED_SOUND_ID);

    public static final Identifier REST_SOUND_ID = new Identifier("dwdsb:rest");
    public static final SoundEvent MUSIC_DISC_REST = SoundEvent.of(REST_SOUND_ID);

// Going Deeper
    public static final Identifier MIRROR_SOUND_ID = new Identifier("dwdsb:mirror");
    public static final SoundEvent MUSIC_DISC_MIRROR = SoundEvent.of(MIRROR_SOUND_ID);

    public static final Identifier RAIN_SOUND_ID = new Identifier("dwdsb:rain");
    public static final SoundEvent MUSIC_DISC_RAIN = SoundEvent.of(RAIN_SOUND_ID);

    public static final Identifier ALONE_SOUND_ID = new Identifier("dwdsb:alone");
    public static final SoundEvent MUSIC_DISC_ALONE = SoundEvent.of(ALONE_SOUND_ID);

// Lost to Time
    public static final Identifier BEAN_SOUND_ID = new Identifier("dwdsb:bean");
    public static final SoundEvent MUSIC_DISC_BEAN = SoundEvent.of(BEAN_SOUND_ID);

    public static final Identifier LYRE_SOUND_ID = new Identifier("dwdsb:lyre");
    public static final SoundEvent MUSIC_DISC_LYRE = SoundEvent.of(LYRE_SOUND_ID);

    public static final Identifier EMBER_SOUND_ID = new Identifier("dwdsb:ember");
    public static final SoundEvent MUSIC_DISC_EMBER = SoundEvent.of(EMBER_SOUND_ID);

// Journey's End
    public static final Identifier STAR_SOUND_ID = new Identifier("dwdsb:star");
    public static final SoundEvent MUSIC_DISC_STAR = SoundEvent.of(STAR_SOUND_ID);

    public static final Identifier RAVE_SOUND_ID = new Identifier("dwdsb:rave");
    public static final SoundEvent MUSIC_DISC_RAVE = SoundEvent.of(RAVE_SOUND_ID);

    public static final Identifier WALTZ_SOUND_ID = new Identifier("dwdsb:waltz");
    public static final SoundEvent MUSIC_DISC_WALTZ = SoundEvent.of(WALTZ_SOUND_ID);

    public static final Identifier SUNSET_SOUND_ID = new Identifier("dwdsb:sunset");
    public static final SoundEvent MUSIC_DISC_SUNSET = SoundEvent.of(SUNSET_SOUND_ID);

// Cooper Whistle Jingles
    public static final Identifier JINGLE_1_ID = new Identifier("dwdsb:jingle_1");
    public static final SoundEvent JINGLE_1 = SoundEvent.of(JINGLE_1_ID);

    public static final Identifier JINGLE_2_ID = new Identifier("dwdsb:jingle_2");
    public static final SoundEvent JINGLE_2 = SoundEvent.of(JINGLE_2_ID);

    public static final Identifier JINGLE_3_ID = new Identifier("dwdsb:jingle_3");
    public static final SoundEvent JINGLE_3 = SoundEvent.of(JINGLE_3_ID);

    public static final Identifier JINGLE_4_ID = new Identifier("dwdsb:jingle_4");
    public static final SoundEvent JINGLE_4 = SoundEvent.of(JINGLE_4_ID);

    public static final Identifier JINGLE_5_ID = new Identifier("dwdsb:jingle_5");
    public static final SoundEvent JINGLE_5 = SoundEvent.of(JINGLE_5_ID);

    public static void registerSounds() {
// Discs Where Discs Shouldn't Be
        register(SOUND_EVENT, WAVE_SOUND_ID, MUSIC_DISC_WAVE);
        register(SOUND_EVENT, LOST_SOUND_ID, MUSIC_DISC_LOST);
        register(SOUND_EVENT, WATCHED_SOUND_ID, MUSIC_DISC_WATCHED);
        register(SOUND_EVENT, REST_SOUND_ID, MUSIC_DISC_REST);
// Going Deeper
        register(SOUND_EVENT, MIRROR_SOUND_ID, MUSIC_DISC_MIRROR);
        register(SOUND_EVENT, RAIN_SOUND_ID, MUSIC_DISC_RAIN);
        register(SOUND_EVENT, ALONE_SOUND_ID, MUSIC_DISC_ALONE);
// Lost to Time
        register(SOUND_EVENT, BEAN_SOUND_ID, MUSIC_DISC_BEAN);
        register(SOUND_EVENT, LYRE_SOUND_ID, MUSIC_DISC_LYRE);
        register(SOUND_EVENT, EMBER_SOUND_ID, MUSIC_DISC_EMBER);
// Journey's End
        register(SOUND_EVENT, STAR_SOUND_ID, MUSIC_DISC_STAR);
        register(SOUND_EVENT, RAVE_SOUND_ID, MUSIC_DISC_RAVE);
        register(SOUND_EVENT, WALTZ_SOUND_ID, MUSIC_DISC_WALTZ);
        register(SOUND_EVENT, SUNSET_SOUND_ID, MUSIC_DISC_SUNSET);
// Copper Whistle Jingles
        register(SOUND_EVENT, JINGLE_1_ID, JINGLE_1);
        register(SOUND_EVENT, JINGLE_2_ID, JINGLE_2);
        register(SOUND_EVENT, JINGLE_3_ID, JINGLE_3);
        register(SOUND_EVENT, JINGLE_4_ID, JINGLE_4);
        register(SOUND_EVENT, JINGLE_5_ID, JINGLE_5);
    }
}