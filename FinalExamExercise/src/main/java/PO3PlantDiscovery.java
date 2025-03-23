import java.util.*;

public class PO3PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantsMap = new LinkedHashMap<>();
        Map<String, List<Double>> ratingMap = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String[] text = scanner.nextLine().split("<->");
            String flower = text[0];
            int rarity = Integer.parseInt(text[1]);
            plantsMap.put(flower, rarity);

            ratingMap.putIfAbsent(flower, new ArrayList<>());
        }
        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String commandName = command.split(": ")[0];
            String[] commandParts = command.split(": ");
            String plant = commandParts[1].split(" - ")[0];
            if (!ratingMap.containsKey(plant) || !plantsMap.containsKey(plant)) {
                System.out.println("error");
                command = scanner.nextLine();

            } else {


                if (commandName.equals("Rate")) {
                    double rating = Double.parseDouble(commandParts[1].split(" - ")[1]);
                    ratingMap.get(plant).add(rating);
                } else if (commandName.equals("Update")) {
                    int newRarity= Integer.parseInt(commandParts[1].split(" - ")[1]);
                    plantsMap.put(plant,newRarity);
                    
                }else if(commandName.equals("Reset")){

                    ratingMap.get(plant).clear();
                }



                command = scanner.nextLine();
            }
        }
        System.out.println("Plants for the exhibition:");
        plantsMap.entrySet().forEach(entry->{
            String name= entry.getKey();
           int rarity=entry.getValue();
           double avgRating=ratingMap.get(name).stream().mapToDouble(rating->rating).average().orElse(0);
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n",name,rarity,avgRating);

        });


    }
}
//•	"Rate: {plant} - {rating}" – add the given rating to the plant (store all ratings)
//•	"Update: {plant} - {new_rarity}" – update the rarity of the plant with the new one
//•	"Reset: {plant}" – remove all the ratinggs of the given plant