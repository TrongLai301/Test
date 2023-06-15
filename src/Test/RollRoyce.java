package Test;

public class RollRoyce extends Car {
    private double width;
    private double height;
    private double weight;
    private  double price;

    public RollRoyce(String carName, String colorName,String engine,double width, double height, double weight, double price) {
        super(carName, colorName, engine);
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.price = price;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RollRoyce{" +
                "carName='" + getCarName() + '\'' +
                ", colorName='" + getColorName() + '\'' +
                ", engine='" + getEngine() + '\'' +
                "width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
