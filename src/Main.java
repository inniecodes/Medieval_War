import model.*;
import system.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Medieval War System" + "\n==================");

        Archer archer = new Archer("An archer",40,50, "Long");
        Knight knight = new Knight("Duncan the tall", 80, 50,50);
        Knight knight2 = new Knight("A great knight", 100, 80,87);
        Catapult catapult = new Catapult("First catapult" , 80, 50,30);

        //Army.Army army1 = new Army.Army();

        Army army1 = new Army();
        army1.addUnit(archer);
        army1.addUnit(knight);
        army1.addUnit(knight2);
        army1.addUnit(catapult);

        System.out.println("\nBattle cry");
        army1.displayBattleCry();
        System.out.println("\n==================\n");


        army1.displayUnits();

    }
}
