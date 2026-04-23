package model;

public class Archer extends Unit{
    private String range; // short or long

    public Archer(String name, int attackPower, int health, String range) {
        super(name, attackPower, health);
        this.range = range;
    }

    @Override
    public void battleCry() {
        System.out.println("IM AN ARCHER HEHEH");
    }
    @Override
    public String toString(){
        return super.toString() + " | Range: " + range;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
}
