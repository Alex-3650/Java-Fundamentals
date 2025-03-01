import java.util.*;

public class PO9ForceBook {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input=scanner.nextLine();
        HashMap<String, List<String>> team=new LinkedHashMap<>();


         while (!input.equals("Lumpawaroo")){
         if (input.contains("|")){
          String side= input.split(" \\| ")[0];
             String user= input.split(" \\| ")[1];
             if (!team.containsKey(side)){
                 team.put(side,new ArrayList<>());
             }

             boolean isThisPlayerPart=false;
             for (List<String> player: team.values()){
                 if (player.contains(user)){
                     isThisPlayerPart=true;
                     break;
                 }
             }
             if (!isThisPlayerPart){
                 team.get(side).add(user);
             }


         }else if (input.contains("->")){

             }


         }
    }
}
