package system;
import model.Unit;
import java.util.ArrayList;

public class Army {
        // array that stores the unities
        private ArrayList<Unit> units;

        public Army(){
            units = new ArrayList<>();
        }

        // adding a unity to my army
        public void addUnit(Unit unit){
            units.add(unit);
        }

        // displaying armies
        public void displayUnits(){
            for (Unit unit : units){
                unit.displayInfo();
                //System.out.println("\nName: " + unit.getName()+ " |  Attack:  " +  unit.getAttackPower()+ " | Health: " + unit.getHealth());
            }
        }

        public void displayBattleCry(){
            for (Unit unit : units){
                unit.battleCry();
            }
        }
    }

