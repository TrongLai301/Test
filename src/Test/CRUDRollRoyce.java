package Test;

import java.io.*;
import java.util.Arrays;

public class CRUDRollRoyce {
    public RollRoyce[] rollRoyces;
    public static int numberOfRollRoyce;

    public CRUDRollRoyce() {
        rollRoyces = new RollRoyce[100];
        numberOfRollRoyce = 0;
    }

    public boolean addRollRoyceToArray(RollRoyce objRollRoyce) {
        if(objRollRoyce!=null){
            if (numberOfRollRoyce > rollRoyces.length) {
                RollRoyce[] rollRoyceNew = Arrays.copyOf(rollRoyces, rollRoyces.length * 2);
                rollRoyces = rollRoyceNew;
            }
            rollRoyces[numberOfRollRoyce++] = objRollRoyce;
            return true;
        }
        return false;
    }
    public boolean addRollRoyceToFile(RollRoyce objRollRoyce, String filename) throws IOException {
        if (objRollRoyce !=null){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
            objectOutputStream.writeObject(objRollRoyce);
            objectOutputStream.close();
            return true;
        }
        return false;
    }
    public RollRoyce getRollRoyceFromFile(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename));
        RollRoyce rollRoyce = (RollRoyce) objectInputStream.readObject();
        objectInputStream.close();
        return rollRoyce;
    }

    public boolean addRollRoyceListToFile(RollRoyce[] listRollRoyce, String filename) throws IOException {
        if (listRollRoyce !=null){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
            objectOutputStream.writeObject(listRollRoyce);
            objectOutputStream.close();
            return true;
        }
        return false;
    }
    public RollRoyce[] getAllRollRoyceFromFile(String filename)throws IOException, ClassNotFoundException{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename));
        RollRoyce[] rollRoyces = (RollRoyce[]) objectInputStream.readObject();
        objectInputStream.close();
        return rollRoyces;
    }



}
