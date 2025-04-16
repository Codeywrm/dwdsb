package net.codewyrm.dwdsb.registry;

import net.codewyrm.dwdsb.util.Util;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class TagRegistry {
    public static final TagKey<Item> VANILLA_DISCS = createTag("vanilla_discs");
    public static final TagKey<Item> MOD_DISCS = createTag("mod_discs");
    public static final TagKey<Item> ROOT_ITEMS = createTag("root_items");
    public static final TagKey<Item> WHISTLES = createTag("whistles");
    private static TagKey<Item> createTag(String name) {
        return TagKey.of(RegistryKeys.ITEM, Util.ofDWDSB(name));
    }
}
