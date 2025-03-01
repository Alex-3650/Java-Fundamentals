package PO5VehicleCatalouge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        List <Vehicle> vehicles=new ArrayList<>();

        while(!input.equals("End")){
            String [] array=input.split(" ");
            String type= array[0];
            String model=array[1];
            String color=array[2];
            int horsePower=Integer.parseInt(array[3]);
            if (type.equals("car")){
                type="Car";
            }
            if (type.equals("truck")){
                type="Truck";
            }
            Vehicle vehicle=new Vehicle(type,model,color,horsePower);
           vehicles.add(vehicle);

            input=scanner.nextLine();
        }


//Type: {typeOfVehicle} Model: {modelOfVehicle} Color: {colorOfVehicle} Horsepower: {horsepowerOfVehicle}


        String car=scanner.nextLine();
        while (!car.equals("Close the Catalogue")){
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(car)){
                    System.out.println("Type: "+ vehicle.getType());
                    System.out.println("Model: "+ vehicle.getModel());
                    System.out.println("Color: "+ vehicle.getColor());
                    System.out.println("Horsepower: "+ vehicle.getHorsepower());
                }
            }
            car=scanner.nextLine();
        }
        double carAverage=avgHorsePowerCar(vehicles);
        System.out.printf("Cars have average horsepower of: %.2f.%n",carAverage);
        double truck=avgHorsePowerTruck( vehicles);
        System.out.printf("Trucks have average horsepower of: %.2f.",truck);

    }

    private static double avgHorsePowerCar(List<Vehicle> vehicles) {
       double sum=0.0;
       int count=0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("Car")){
                count++;
                sum+=vehicle.getHorsepower();
            }
        }
        if (count==0||sum==0){
            return 0;
        }else{
            return sum/count;
        }
    }
    private static double avgHorsePowerTruck(List<Vehicle> vehicles) {
        double sum=0.0;
        int count=0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("Truck")){
                sum+=vehicle.getHorsepower();
                count++;
            }
        }
        if (count==0||sum==0){
            return 0;
        }else{
            return sum/count;
        }

    }
}
