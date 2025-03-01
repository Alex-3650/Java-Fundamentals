package PO5VehicleCatalouge;

public class Vehicle {

    String type;
    String model;
    String color;
    int horsepower;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Vehicle(String type, String model, String color,int horsepower) {
        this.color = color;
        this.horsepower = horsepower;
        this.model = model;
        this.type = type;
    }
}
