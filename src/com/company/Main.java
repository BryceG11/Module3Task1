package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> AL1 = new ArrayList<String>();
        AL1.add("Red Fish");
        AL1.add("Blue Fish");
        AL1.add("One Fish");
        AL1.add("Two Fish");
        System.out.println(AL1);
        ArrayList<String> AL2 = new ArrayList<String>();
        AL2.add("Farfetched");
        AL2.add("Articuno");
        AL2.add("Shuckle");
        AL2.add("Shiny Shuckle");
        AL1.addAll(1,AL2);
        System.out.println(AL1);
        AL1.remove(1);
        System.out.println(AL1.get(3));
        AL1.set(0, "Shiny Shuckle");
        System.out.println(AL1);
    }
}
