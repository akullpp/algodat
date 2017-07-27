package de.akull.ctci;

import java.util.HashMap;

public class CheckPermutation_1_2 {

    public static HashMap<Character, Integer> getCharacters(String a) {
        HashMap<Character, Integer> characters = new HashMap<>();

        for (Character c : a.toUpperCase().toCharArray()) {
            characters.putIfAbsent(c, 0);
            characters.put(c, characters.get(c) + 1);
        }
        return characters;
    }

    public static boolean isPermutation(String a, String b) {
        int n = a.chars().sum();
        int m = b.chars().sum();

        return n == m;
    }

    /*
     * Assumptions:
     *
     * 1. Case insensitive
     */
    public static boolean checkPermutation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> A = getCharacters(a);
        HashMap<Character, Integer> B = getCharacters(b);

        for (Character c : A.keySet()) {
            if (!A.get(c).equals(B.get(c))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String a = "Java";
        String b = "Python";
        String c = "Avaj";

        System.out.println(isPermutation(a, b));
        System.out.println(isPermutation(a, c));
    }
}
