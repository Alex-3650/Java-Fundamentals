package PO33;

import java.util.*;

public class NeedforSpeedIII {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n=Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> map=new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

          String [] data=scanner.nextLine().split("\\|");
          String carModel=data[0];
          int mileage= Integer.parseInt(data[1]);
          int fuel= Integer.parseInt(data[2]);
          map.put(carModel,new ArrayList<>());
          map.get(carModel).add(0,mileage);
            map.get(carModel).add(1,fuel);

        }
        String command=scanner.nextLine();
        while (!command.equals("Stop")){

         /*
         * Drive : {car} : {distance} : {fuel}":
         *
         *Refuel : {car} : {fuel}":
         *
         *
         *Revert : {car} : {kilometers}":
         *
         */
        String [] commandParts=command.split(" : ");
        String commandName=commandParts[0];
        String carModel=commandParts[1];

        switch (commandName){

            case "Drive"->{
                int distance = Integer.parseInt(commandParts[2]);
                int fuel= Integer.parseInt(commandParts[3]);

                if (map.get(carModel).getLast()<fuel){
                    System.out.println("Not enough fuel to make that ride");
                }else{
                    int currentFuel=map.get(carModel).getLast();
                    map.get(carModel).set(1,currentFuel-fuel);

                    int currentMileage=map.get(carModel).getFirst();
                    map.get(carModel).set(0,currentMileage+distance);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n",carModel,distance,fuel);
                }
                if (map.get(carModel).getFirst()> 100000){
                    System.out.printf("Time to sell the %s!\n",carModel);
                    map.remove(carModel);
                }
            }
            case "Refuel"->{
                int fuel= Integer.parseInt(commandParts[2]);
                int currentFuel=map.get(carModel).getLast();
                int refueled=fuel;
                if (currentFuel+fuel>75){
                    map.get(carModel).set(1,75);
                    refueled=75-currentFuel;
                }else{
                    map.get(carModel).set(1,fuel+currentFuel);
                }
                System.out.printf("%s refueled with %d liters\n",carModel,refueled);


            }
            case "Revert"->{
                int kilometers = Integer.parseInt(commandParts[2]);


                int decrease=map.get(carModel).getFirst();
                int current=kilometers;
                map.get(carModel).set(0,decrease-kilometers);
                if (map.get(carModel).getFirst()<10000){
                    map.get(carModel).set(0,10000);
                    current=kilometers=10000;
                }
                System.out.printf("%s mileage decreased by %d kilometers\n",carModel,current);
            }
        }
        command=scanner.nextLine();
        }
        for (Map.Entry<String, List<Integer>> stringListEntry : map.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n",stringListEntry.getKey(),stringListEntry.getValue().getFirst(),stringListEntry.getValue().getLast());
        }
    }

}
