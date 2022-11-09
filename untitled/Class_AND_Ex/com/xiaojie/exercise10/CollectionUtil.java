package com.xiaojie.exercise10;

import java.util.*;

public class CollectionUtil {
    private CollectionUtil() {
    }

    public static <T> void addAllElement(ArrayList<T> list, T... t) {
        for (T t1 : t) {
            list.add(t1);
        }
    }

    public static <T> void pushAllElement(HashSet<T> hashSet, T... t) {
        for (T t1 : t) {
            hashSet.add(t1);
        }
    }

    public static <T> void putAllElement(TreeSet<T> treeSet, T... t) {
        for (T t1 : t) {
            treeSet.add(t1);
        }
    }
}
