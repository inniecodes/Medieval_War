package model;

public class Knight extends Unit{
    private int armorRating;

    public Knight(String name, int attackPower, int health, int armorRating) {
        super(name, attackPower, health);
        this.armorRating = armorRating;
    }


    // toString returns a String value of an Object
    @Override
    public String toString(){
        return super.toString() + " | Armor: " + armorRating;
    }
    @Override
    public void battleCry() {
        System.out.println("AAAAAAAAAAA IM A KNIGHT!");
    }

    public int getArmorRating() {
        return armorRating;
    }

    public void setArmorRating(int armorRating) {
        this.armorRating = armorRating;
    }
}
