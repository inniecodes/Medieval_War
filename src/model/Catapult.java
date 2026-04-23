package model;

public class Catapult extends Unit {
    private int reloadTime; // in seconds

    public Catapult(String name, int attackPower, int health, int reloadTime) {
        super(name, attackPower, health);
        this.reloadTime = reloadTime;
    }

    @Override
    public String toString(){
        return super.toString() + " | Reload Time: " + reloadTime;
    }


    @Override
    public void battleCry(){
        System.out.println("IM A CATAPULT LETS CATAPULT THINGS");
    }

    public int getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(int reloadTime) {
        this.reloadTime = reloadTime;
    }

}
