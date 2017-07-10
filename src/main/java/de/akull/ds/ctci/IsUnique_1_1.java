package de.akull.ds.ctci;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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
