package de.akull.ctci;

import java.util.HashSet;

public class IsUnique_1_1 {

    public static boolean isUnique(String s) {
        HashSet<Character> characters = new HashSet<>();

        for (char c : s.toCharArray()) {
            characters.add(c);
        }
        return characters.size() == s.length();
    }

    public static void main(String[] args) {
        String a = "Java";
        String b = "Python";

        System.out.println(isUnique(a));
        System.out.println(isUnique(b));
    }
}
