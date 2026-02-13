package uk.ac.belfastmet;

public class Dwarf {
    private String name;
    private String beardColour;
    private String weapon;

    public Dwarf(String name, String beardColour, String weapon) {
        this.name = name;
        this.beardColour = beardColour;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeardColour() {
        return beardColour;
    }

    public void setBeardColour(String beardColour) {
        this.beardColour = beardColour;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
