import java.util.HashMap;
import java.util.Objects;

public class Car {

    String name;
    HashMap<String, Object> data;


    public Car(String name, HashMap<String, Object> data) {
        this.name = name;
        this.data=data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }













}