package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();

        Dwarf sleepy = new Dwarf();
        sleepy.setName("Sleepy");
        sleepy.setAuthor("Disney");
        dwarfs.add(sleepy);

        Dwarf thorin = new Dwarf();
        thorin.setName("Thorin");
        thorin.setAuthor("Tolkien");
        dwarfs.add(thorin);

        System.out.println("The Disney Dwarfs are:");

        for (Dwarf dwarf : dwarfs) {
            if (dwarf.getAuthor().equals("Disney")) {
                System.out.println(dwarf.getName());
            }
        }
        System.out.println("The Tolkien Dwarfs are:");

        for (Dwarf dwarf : dwarfs) {
            if (dwarf.getAuthor().equals("Tolkien")) {
                System.out.println(dwarf.getName());
            }
        }
    }
}
