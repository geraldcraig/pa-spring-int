package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        ArrayList<String> dwarfs = new ArrayList<String>();
        dwarfs.add("Sleepy");
        dwarfs.add("Sneezy");
        dwarfs.add("Bashful");
        dwarfs.add("Happy");
        dwarfs.add("Doc");
        dwarfs.add("Grumpy");
        dwarfs.add("Dopey");

        System.out.println("The seven dwarfs are:");

        for (String dwarf : dwarfs) {
            System.out.println(dwarf);
        }

        ArrayList<String> dwarves = new ArrayList<String>();
        dwarves.add("Thorin");
        dwarves.add("Balin");
        dwarves.add("Dwalin");
        dwarves.add("Fili");
        dwarves.add("Kili");
        dwarves.add("Dori");
        dwarves.add("Nori");
        dwarves.add("Ori");
        dwarves.add("Oin");
        dwarves.add("Gloin");
        dwarves.add("Bifur");
        dwarves.add("Bofur");
        dwarves.add("Bombur");

        System.out.println("The Company of Dwarves are:");

        for (String dwarve : dwarves) {
            System.out.println(dwarve);
        }
    }
}
