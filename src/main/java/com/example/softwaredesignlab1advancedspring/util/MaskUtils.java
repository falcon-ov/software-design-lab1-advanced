package com.example.softwaredesignlab1advancedspring.util;

public class MaskUtils {
    public static int combineMasks(int mask1, int mask2) {
        return mask1 | mask2;
    }

    // Метод 2: пересечение масок
    public static int intersectMasks(int mask1, int mask2) {
        return mask1 & mask2;
    }

    // Метод 3: исключение маски
    public static int excludeMask(int mask, int exclude) {
        return mask & ~exclude;
    }

    // Дополнительно: проверка, входит ли поле в маску
    public static boolean isFieldIncluded(int mask, int field) {
        return (mask & field) != 0;
    }
}
