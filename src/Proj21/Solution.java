package Proj21;

import java.util.*;

public class Solution<T, V, K> {
    private T t;
    private V v;
    private K k;

    public Solution(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public static <T> List<T> newArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    public static <T> Set<T> newHashSet(T... elements) {
        Set<T> set = new HashSet<>();
        for (T element : elements) {
            set.add(element);
        }
        return set;
    }

    public static <K, V> Map<K, V> newHashMap(Object... keyValuePairs) {
        if (keyValuePairs.length % 2 != 0) {
            throw new IllegalArgumentException("Количество аргументов должно быть четным.");
        }

        Map<K, V> map = new HashMap<>();
        for (int i = 0; i < keyValuePairs.length; i += 2) {
            K key = (K) keyValuePairs[i];
            V value = (V) keyValuePairs[i + 1];
            map.put(key, value);
        }
        return map;
    }

    public static void main(String[] args) {
        List<String> stringList = newArrayList("A", "B", "C", "A");
        System.out.println(stringList);

        Set<Integer> integerSet = newHashSet(1, 2, 3, 3);
        System.out.println(integerSet);

        Map<String, Integer> stringToIntegerMap = newHashMap("One", 1, "Two", 2, "Three", 3, "Three", "Three");
        System.out.println(stringToIntegerMap);
    }
}

