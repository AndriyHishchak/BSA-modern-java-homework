package com.binary_studio.uniq_in_sorted_stream;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class Utility {

    public static <T> Predicate<T> Сontents(Function<? super T, ?> key) {
        Map<Object, Boolean> isSeen = new ConcurrentHashMap<>();
        return p -> isSeen.putIfAbsent(key.apply(p), Boolean.TRUE) == null;
    }
}
