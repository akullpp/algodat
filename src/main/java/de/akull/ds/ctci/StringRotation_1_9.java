package de.akull.ds.ctci;

public class StringRotation_1_9 {

    public static void main(String[] args) {
        String a = "waterbottle";
        String b = "erbottlewat";
        String c = "erbottlewar";
        String d = "waterbottlewaterbottle";

        System.out.println(d.contains(a));
        System.out.println(d.contains(b));
        System.out.println(d.contains(c));
    }
}
