package uk.ac.belfastmet;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();

        dwarfs.add(new Dwarf("Sleepy", "Disney"));
        dwarfs.add(new Dwarf("Happy", "Disney"));
        dwarfs.add(new Dwarf("Grumpy", "Disney"));
        dwarfs.add(new Dwarf("Dopey", "Disney"));
        dwarfs.add(new Dwarf("Doc", "Disney"));
        dwarfs.add(new Dwarf("Bashful", "Disney"));
        dwarfs.add(new Dwarf("Sneezy", "Disney"));

        dwarfs.add(new Dwarf("Thorin", "Tolkien"));
        dwarfs.add(new Dwarf("Balin", "Tolkien"));
        dwarfs.add(new Dwarf("Dwalin", "Tolkien"));
        dwarfs.add(new Dwarf("Fifi", "Tolkien"));
        dwarfs.add(new Dwarf("Ori", "Tolkien"));
        dwarfs.add(new Dwarf("Fili", "Tolkien"));
        dwarfs.add(new Dwarf("Kili", "Tolkien"));

        System.out.println("The Tolkien Dwarfs are");
        for (Dwarf dwarf : dwarfs) {
            if (Objects.equals(dwarf.getAuthor(), "Tolkien")) {
                System.out.println(dwarf.getName());
            }

        }
        System.out.println("The Disney Dwarfs are");
        for (Dwarf dwarf : dwarfs) {
            if (Objects.equals(dwarf.getAuthor(), "Disney")) {
                System.out.println(dwarf.getName());
            }
        }
    }
}