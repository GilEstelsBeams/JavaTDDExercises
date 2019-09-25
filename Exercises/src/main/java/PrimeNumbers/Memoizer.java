package PrimeNumbers;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public final class Memoizer {
    public static <I, O> Function<I, O> memoize(Function<I, O> f) {
        Map<I, O> lookup = new ConcurrentHashMap<>();
        return input -> lookup.computeIfAbsent(input, f);
    }
}
