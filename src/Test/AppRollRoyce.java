package Test;

import java.io.File;
import java.io.IOException;

public class AppRollRoyce {
    public static void main(String[] args) {
        RollRoyce rollRoyce1 = new RollRoyce("roll1", "blue", "111", 2, 3, 4, 5);
        RollRoyce rollRoyce2 = new RollRoyce("roll2", "red", "112", 3, 4, 5, 5);
        RollRoyce rollRoyce3 = new RollRoyce("roll3", "yellow", "113", 1, 55, 6, 1);
        CRUDRollRoyce crudRollRoyce = new CRUDRollRoyce();
        crudRollRoyce.addRollRoyceToArray(rollRoyce1);
        crudRollRoyce.addRollRoyceToArray(rollRoyce2);
        crudRollRoyce.addRollRoyceToArray(rollRoyce3);
        try {
            String fileName = "Car.txt";
            File file = new File(fileName);
            if (file.exists()) {
                file.createNewFile();
            }

            crudRollRoyce.addRollRoyceToFile(rollRoyce1,fileName);
            System.out.println(crudRollRoyce.getRollRoyceFromFile(fileName));

            crudRollRoyce.addRollRoyceListToFile(crudRollRoyce.rollRoyces,fileName);
            for (RollRoyce displayList: crudRollRoyce.rollRoyces
                 ) {
                if (displayList!=null){
                    System.out.println(displayList);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

