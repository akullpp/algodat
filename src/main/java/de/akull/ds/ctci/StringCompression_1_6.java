package de.akull.ds.ctci;

import java.util.HashMap;

public class StringCompression_1_6 {

    private static String compress(String s) {
        StringBuilder compressedString = new StringBuilder();
        HashMap<Character, Integer> counts = new HashMap<>();

        for (Character c : s.toCharArray()) {
            counts.putIfAbsent(c, 0);
            counts.put(c, counts.get(c) + 1);
        }

        for (HashMap.Entry<Character, Integer> count : counts.entrySet()) {
            compressedString.append(count.getKey());

            int times = count.getValue();
            if (times > 1) {
                compressedString.append(times);
            }
        }
        return compressedString.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("AAAaaaaaBbbbccDd"));
    }
}
