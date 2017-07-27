package de.akull.ctci;

import java.util.HashMap;

public class PermutationPalindrome_1_4 {

    public static boolean isPalindrom(String s) {
        HashMap<Character, Integer> counts = new HashMap<>();

        for (Character c : s.toCharArray()) {
            counts.putIfAbsent(c, 0);
            counts.put(c, counts.get(c) + 1);
        }

        if (counts.keySet().size() % 2 == 0) {
            for (Integer count : counts.values()) {
                if (count % 2 != 0) {
                    return false;
                }
            }
        } else {
            int nOdds = 0;

            for (Integer count : counts.values()) {
                if (nOdds > 1) {
                    return false;
                }
                if (count % 2 != 0) {
                    nOdds++;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "civic";
        String b = "vicic";
        String c = "ciivc";
        String d = "cicvc";
        String e = "anna";
        String f = "anan";

        System.out.println(isPalindrom(f));
    }
}
