package net.codewyrm.dwdsb.util;

import net.minecraft.util.Identifier;
import java.util.Objects;

public class Util {

    private Util() {
    }

    public static Identifier ofMinecraft(String name) {
        return Identifier.of("minecraft", name);
    }

    public static Identifier ofDWDSB(String name) {
        return Identifier.of("dwdsb", name);
    }

    public static boolean equalsAny(Object needle, Object... haystack) {
        for (Object x : haystack) {
            if (Objects.equals(x, needle)) {
                return true;
            }
        }
        return false;
    }
}