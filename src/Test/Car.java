package Test;

import java.io.Serializable;

public class Car implements Serializable {
    private String carName;
    private String colorName;
    private String engine;
    public Car(){

    }
    public Car(String carName, String colorName,String engine){
        this.carName = carName;
        this.colorName= colorName;
        this.engine= engine;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", colorName='" + colorName + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
