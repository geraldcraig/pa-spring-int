package uk.ac.belfastmet;

public class Dwarf {

    private String name;
    private String weapon;
    private int age;

    public Dwarf(String name, String weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
