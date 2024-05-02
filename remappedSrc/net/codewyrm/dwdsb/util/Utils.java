package net.codewyrm.dwdsb.util;

import java.util.Objects;

public class Utils {
    public static boolean equalsAny(Object needle, Object... haystack) {
        for (Object x : haystack) {
            if (Objects.equals(x, needle)) {
                return true;
            }
        }
        return false;
    }
}
