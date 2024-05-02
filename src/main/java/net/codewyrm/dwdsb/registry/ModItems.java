package net.codewyrm.dwdsb.registry;
import net.codewyrm.dwdsb.init.MusicInit;
import net.codewyrm.dwdsb.item.custom.CopperWhistleItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import static net.codewyrm.dwdsb.init.MusicInit.*;
import static net.minecraft.registry.Registry.register;
import static net.minecraft.registry.Registries.*;
import static net.codewyrm.dwdsb.MusicDiscMod.MOD_ID;
public class ModItems {
// All items that are not music discs.
    public static final Item UNREFINED_DISC_CORE = new Item(new Item.Settings().rarity(Rarity.COMMON).maxCount(64));
    public static final Item MELODY_POTTERY_SHERD = new Item(new Item.Settings().rarity(Rarity.COMMON).maxCount(64));
    public static final Item ANCIENT_WHISTLE = new CopperWhistleItem(new Item.Settings().rarity(Rarity.COMMON).maxCount(1), JINGLE_1);
    public static final Item AMETHYST_WHISTLE = new CopperWhistleItem(new Item.Settings().rarity(Rarity.COMMON).maxCount(1), JINGLE_2);
    public static final Item GOLD_WHISTLE = new CopperWhistleItem(new Item.Settings().rarity(Rarity.COMMON).maxCount(1), JINGLE_3);
    public static final Item DIAMOND_WHISTLE = new CopperWhistleItem(new Item.Settings().rarity(Rarity.COMMON).maxCount(1), JINGLE_4);
    public static final Item EMERALD_WHISTLE = new CopperWhistleItem(new Item.Settings().rarity(Rarity.COMMON).maxCount(1), JINGLE_5);

// All items that are music discs.
    public static final Item WAVE = new MusicDiscItem(1, MusicInit.MUSIC_DISC_WAVE, new Item.Settings().rarity(Rarity.RARE).maxCount(1), 127);
    public static final Item LOST = new MusicDiscItem(2, MusicInit.MUSIC_DISC_LOST, new Item.Settings().rarity(Rarity.RARE).maxCount(1), 162);
    public static final Item WATCHED = new MusicDiscItem(3, MusicInit.MUSIC_DISC_WATCHED, new Item.Settings().rarity(Rarity.RARE).maxCount(1), 188);
    public static final Item REST = new MusicDiscItem(4, MusicInit.MUSIC_DISC_REST, new Item.Settings().rarity(Rarity.RARE).maxCount(1), 138);
    public static final Item MIRROR = new MusicDiscItem(5, MusicInit.MUSIC_DISC_MIRROR, new Item.Settings().rarity(Rarity.RARE).maxCount(1), 118);
    public static final Item RAIN = new MusicDiscItem(6, MusicInit.MUSIC_DISC_RAIN, new Item.Settings().rarity(Rarity.RARE).maxCount(1), 185);
    public static final Item ALONE = new MusicDiscItem(7, MusicInit.MUSIC_DISC_ALONE, new Item.Settings().rarity(Rarity.RARE).maxCount(1), 167);
    public static final Item BEAN = new MusicDiscItem(8, MusicInit.MUSIC_DISC_BEAN, new Item.Settings().rarity(Rarity.RARE).maxCount(1), 135);
    public static final Item LYRE = new MusicDiscItem(9, MusicInit.MUSIC_DISC_LYRE, new Item.Settings().rarity(Rarity.RARE).maxCount(1), 215);
    public static final Item EMBER = new MusicDiscItem(10, MusicInit.MUSIC_DISC_EMBER, new Item.Settings().rarity(Rarity.RARE).maxCount(1), 187);
    public static final Item STAR = new MusicDiscItem(11, MusicInit.MUSIC_DISC_STAR, new Item.Settings().rarity(Rarity.RARE).maxCount(1), 206);
    public static final Item RAVE = new MusicDiscItem(12, MusicInit.MUSIC_DISC_RAVE, new Item.Settings().rarity(Rarity.RARE).maxCount(1), 197);
    public static final Item WALTZ = new MusicDiscItem(13, MusicInit.MUSIC_DISC_WALTZ, new Item.Settings().rarity(Rarity.RARE).maxCount(1), 164);
    public static final Item SUNSET = new MusicDiscItem(14, MusicInit.MUSIC_DISC_SUNSET, new Item.Settings().rarity(Rarity.RARE).maxCount(1), 336);

    public static void registerItems() {
// All items that are not music discs.
        register(ITEM, new Identifier(MOD_ID, "unrefined_disc_core"), UNREFINED_DISC_CORE);
        register(ITEM, new Identifier(MOD_ID, "melody_pottery_sherd"), MELODY_POTTERY_SHERD);
        register(ITEM, new Identifier(MOD_ID, "ancient_whistle"), ANCIENT_WHISTLE);
        register(ITEM, new Identifier(MOD_ID, "amethyst_whistle"), AMETHYST_WHISTLE);
        register(ITEM, new Identifier(MOD_ID, "gold_whistle"), GOLD_WHISTLE);
        register(ITEM, new Identifier(MOD_ID, "diamond_whistle"), DIAMOND_WHISTLE);
        register(ITEM, new Identifier(MOD_ID, "emerald_whistle"), EMERALD_WHISTLE);
// Discs Where Discs Shouldn't Be
        register(ITEM, new Identifier(MOD_ID, "wave"),WAVE);
        register(ITEM, new Identifier(MOD_ID, "lost"),LOST);
        register(ITEM, new Identifier(MOD_ID, "watched"),WATCHED);
        register(ITEM, new Identifier(MOD_ID, "rest"),REST);
// Going Deeper
        register(ITEM, new Identifier(MOD_ID, "mirror"),MIRROR);
        register(ITEM, new Identifier(MOD_ID, "rain"),RAIN);
        register(ITEM, new Identifier(MOD_ID, "alone"),ALONE);
// Lost to Time
        register(ITEM, new Identifier(MOD_ID, "bean"),BEAN);
        register(ITEM, new Identifier(MOD_ID, "lyre"),LYRE);
        register(ITEM, new Identifier(MOD_ID, "ember"),EMBER);
// Journey's End
        register(ITEM, new Identifier(MOD_ID, "star"),STAR);
        register(ITEM, new Identifier(MOD_ID, "rave"),RAVE);
        register(ITEM, new Identifier(MOD_ID, "waltz"),WALTZ);
        register(ITEM, new Identifier(MOD_ID, "sunset"),SUNSET);
    }

    public static void addItemsToItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.addAfter(Items.MUSIC_DISC_PIGSTEP,
                    WAVE, LOST, WATCHED, REST,
                    MIRROR, RAIN, ALONE,
                    BEAN, LYRE, EMBER,
                    STAR, RAVE, WALTZ, SUNSET,
                    ANCIENT_WHISTLE, AMETHYST_WHISTLE, GOLD_WHISTLE,
                    DIAMOND_WHISTLE, EMERALD_WHISTLE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addAfter(Items.DISC_FRAGMENT_5, UNREFINED_DISC_CORE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addAfter(Items.SNORT_POTTERY_SHERD, MELODY_POTTERY_SHERD);});
    }
}