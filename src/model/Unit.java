package model;

public abstract class Unit {
    // Atributtes
    private String name;
    private int health;
    private int attackPower;


    //  constructor
    public Unit(String name, int attackPower, int health) {
        this.name = name;
        this.attackPower = attackPower;
        this.health = health;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Power: " + attackPower + " | Health: " + health;
    }


    // getters and setters
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getHealth() {return health;}
    public void setHealth(int health) {this.health = health;}

    public int getAttackPower() {return attackPower;}
    public void setAttackPower(int attackPower) {this.attackPower = attackPower;}

    //abstract method that will be overwritten by other classes.
    public abstract void battleCry();


    public void displayInfo() {
        System.out.println(this);
    }

}
