package de.akull.ctci;

public class Urlify_1_3 {

    public static void main(String[] args) {
        String a = "Mr John Smith     ";

        System.out.println(a.trim().replaceAll(" ", "%20"));
    }
}
