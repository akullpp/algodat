package de.akull.ctci;

import java.util.HashSet;

public class OneAway_1_5 {

    public static HashSet<Character> getCharacters(String s) {
        char[] chars = s.toUpperCase().toCharArray();
        HashSet<Character> characters = new HashSet<>();

        for (char c : chars) {
            characters.add(c);
        }
        return characters;
    }

    public static boolean isOneAway(String a, String b) {
        HashSet<Character> A = getCharacters(a);
        HashSet<Character> B = getCharacters(b);

        int off = Math.abs(A.size() - B.size());

        if (off > 1) {
            return false;
        }
        int diff = off == 1 ? -1 : 0;

        for (Character c : A) {
            if (!B.contains(c)) {
                diff++;
            }
        }
        return off + diff == 1;
    }

    public static void main(String[] args) {
        System.out.println(isOneAway("pale", "ple"));
        System.out.println(isOneAway("pales", "pale"));
        System.out.println(isOneAway("pale", "bale"));
        System.out.println(isOneAway("pale", "bake"));
    }
}
