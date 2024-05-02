package net.codewyrm.dwdsb.util;

import net.minecraft.util.Identifier;

public class IdentifierUtils {

    private IdentifierUtils() {
    }

    public static Identifier ofMinecraft(String name) {
        return new Identifier("minecraft", name);
    }
}
