package net.codewyrm.dwdsb.registry;

import net.codewyrm.dwdsb.item.WhistleItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.function.Function;

import static net.codewyrm.dwdsb.registry.SoundRegistry.*;
import static net.minecraft.item.Items.register;

public class ItemRegistry {
    public static final Item DISC_CORE = registerItem("disc_core", Item::new, new Item.Settings().rarity(Rarity.UNCOMMON));

/*
    SHERDS
*/
    public static final Item MELODY_POTTERY_SHERD = registerItem("melody_pottery_sherd", Item::new, new Item.Settings().rarity(Rarity.UNCOMMON));
    public static final Item RECORD_POTTERY_SHERD = registerItem("record_pottery_sherd", Item::new, new Item.Settings().rarity(Rarity.UNCOMMON));
    public static final Item SOLO_POTTERY_SHERD = registerItem("solo_pottery_sherd", Item::new, new Item.Settings().rarity(Rarity.UNCOMMON));

/*
    WHISTLE
*/
    public static final Item ANCIENT_WHISTLE = registerItem("ancient_whistle",
            (settings) -> new WhistleItem(settings, ANCIENT_JINGLE_SOUND_EVENT, 15),
            new Item.Settings()
                    .maxCount(1)
                    .rarity(Rarity.UNCOMMON));
    public static final Item AMETHYST_WHISTLE = registerItem("amethyst_whistle",
            (settings) -> new WhistleItem(settings, AMETHYST_JINGLE_SOUND_EVENT, 17),
            new Item.Settings()
                    .maxCount(1)
                    .rarity(Rarity.UNCOMMON));
    public static final Item GOLD_WHISTLE = registerItem("gold_whistle",
            (settings) -> new WhistleItem(settings, GOLD_JINGLE_SOUND_EVENT, 21),
            new Item.Settings()
                    .maxCount(1)
                    .rarity(Rarity.UNCOMMON));
    public static final Item DIAMOND_WHISTLE = registerItem("diamond_whistle",
            (settings) -> new WhistleItem(settings, DIAMOND_JINGLE_SOUND_EVENT, 17),
            new Item.Settings()
                    .maxCount(1)
                    .rarity(Rarity.UNCOMMON));
    public static final Item EMERALD_WHISTLE = registerItem("emerald_whistle",
            (settings) -> new WhistleItem(settings, EMERALD_JINGLE_SOUND_EVENT, 16),
            new Item.Settings()
                    .maxCount(1)
                    .rarity(Rarity.UNCOMMON));

/*
    DISCS WHERE DISCS SHOULDN'T BE
*/
    public static final Item WAVE = registerDiscItem(WAVE_SOUND_EVENT, Item::new, new Item.Settings()
            .jukeboxPlayable(RegistryKey.of(RegistryKeys.JUKEBOX_SONG, WAVE_SOUND_KEY))
            .maxCount(1)
            .rarity(Rarity.UNCOMMON));
    public static final Item LOST = registerDiscItem(LOST_SOUND_EVENT, Item::new, new Item.Settings()
            .jukeboxPlayable(RegistryKey.of(RegistryKeys.JUKEBOX_SONG, LOST_SOUND_KEY))
            .maxCount(1)
            .rarity(Rarity.EPIC));
    public static final Item WATCHED = registerDiscItem(WATCHED_SOUND_EVENT, Item::new, new Item.Settings()
            .jukeboxPlayable(RegistryKey.of(RegistryKeys.JUKEBOX_SONG, WATCHED_SOUND_KEY))
            .maxCount(1)
            .rarity(Rarity.RARE));
    public static final Item REST = registerDiscItem(REST_SOUND_EVENT, Item::new, new Item.Settings()
            .jukeboxPlayable(RegistryKey.of(RegistryKeys.JUKEBOX_SONG, REST_SOUND_KEY))
            .maxCount(1)
            .rarity(Rarity.RARE));

/*
    GOING DEEPER
*/
    public static final Item MIRROR = registerDiscItem(MIRROR_SOUND_EVENT, Item::new, new Item.Settings()
            .jukeboxPlayable(RegistryKey.of(RegistryKeys.JUKEBOX_SONG, MIRROR_SOUND_KEY))
            .maxCount(1)
            .rarity(Rarity.UNCOMMON));
    public static final Item RAIN = registerDiscItem(RAIN_SOUND_EVENT, Item::new, new Item.Settings()
            .jukeboxPlayable(RegistryKey.of(RegistryKeys.JUKEBOX_SONG, RAIN_SOUND_KEY))
            .maxCount(1)
            .rarity(Rarity.UNCOMMON));
    public static final Item ALONE = registerDiscItem(ALONE_SOUND_EVENT, Item::new, new Item.Settings()
            .jukeboxPlayable(RegistryKey.of(RegistryKeys.JUKEBOX_SONG, ALONE_SOUND_KEY))
            .maxCount(1)
            .rarity(Rarity.UNCOMMON));

/*
    LOST TO TIME
*/
    public static final Item BEAN = registerDiscItem(BEAN_SOUND_EVENT, Item::new, new Item.Settings()
            .jukeboxPlayable(RegistryKey.of(RegistryKeys.JUKEBOX_SONG, BEAN_SOUND_KEY))
            .maxCount(1)
            .rarity(Rarity.UNCOMMON));
    public static final Item LYRE = registerDiscItem(LYRE_SOUND_EVENT, Item::new, new Item.Settings()
            .jukeboxPlayable(RegistryKey.of(RegistryKeys.JUKEBOX_SONG, LYRE_SOUND_KEY))
            .maxCount(1)
            .rarity(Rarity.UNCOMMON));
    public static final Item EMBER = registerDiscItem(EMBER_SOUND_EVENT, Item::new, new Item.Settings()
            .jukeboxPlayable(RegistryKey.of(RegistryKeys.JUKEBOX_SONG, EMBER_SOUND_KEY))
            .maxCount(1)
            .rarity(Rarity.RARE));

/*
    JOURNEY'S END
*/
    public static final Item STAR = registerDiscItem(STAR_SOUND_EVENT, Item::new, new Item.Settings()
            .jukeboxPlayable(RegistryKey.of(RegistryKeys.JUKEBOX_SONG, STAR_SOUND_KEY))
            .maxCount(1)
            .rarity(Rarity.UNCOMMON));
    public static final Item RAVE = registerDiscItem(RAVE_SOUND_EVENT, Item::new, new Item.Settings()
            .jukeboxPlayable(RegistryKey.of(RegistryKeys.JUKEBOX_SONG, RAVE_SOUND_KEY))
            .maxCount(1)
            .rarity(Rarity.UNCOMMON));
    public static final Item WALTZ = registerDiscItem(WALTZ_SOUND_EVENT, Item::new, new Item.Settings()
            .jukeboxPlayable(RegistryKey.of(RegistryKeys.JUKEBOX_SONG, WALTZ_SOUND_KEY))
            .maxCount(1)
            .rarity(Rarity.RARE));
    public static final Item SUNSET = registerDiscItem(SUNSET_SOUND_EVENT, Item::new, new Item.Settings()
            .jukeboxPlayable(RegistryKey.of(RegistryKeys.JUKEBOX_SONG, SUNSET_SOUND_KEY))
            .maxCount(1)
            .rarity(Rarity.UNCOMMON));

    public static Item registerItem(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of("dwdsb", path));
        return register(registryKey, factory, settings);
    }

    public static Item registerDiscItem(SoundEvent path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of("dwdsb", path.id().getPath()));
        return register(registryKey, factory, settings);
    }

    public static void registerItems() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.addAfter(Items.MUSIC_DISC_TEARS,
                    WAVE, LOST, WATCHED, REST,
                    MIRROR, RAIN, ALONE,
                    BEAN, LYRE, EMBER,
                    STAR, RAVE, WALTZ, SUNSET,
                    ANCIENT_WHISTLE, AMETHYST_WHISTLE, GOLD_WHISTLE,
                    DIAMOND_WHISTLE, EMERALD_WHISTLE);
            }
        );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addAfter(Items.DISC_FRAGMENT_5, DISC_CORE);
            }
        );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addAfter(Items.SNORT_POTTERY_SHERD,
                    MELODY_POTTERY_SHERD, RECORD_POTTERY_SHERD, SOLO_POTTERY_SHERD);
            }
        );
    }
}