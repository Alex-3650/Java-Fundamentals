import java.util.*;

public class PO9ForceBook {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

      String input=scanner.nextLine();
        Map<String, List<String>> players=new LinkedHashMap<>();

      while (!input.equals("Lumpawaroo")){

          if (input.contains("|")){
              String side=input.split(" \\| ")[0];
              String user=input.split(" \\| ")[1];
              //////////////////////////
              if (!players.containsKey(side)){
                  players.put(side,new ArrayList<>());
              }
              //////////////////////////
              boolean isThisPlayerExist=false;
              //////////////////////////
              for (List<String> users : players.values()) {
                  if (users.contains(user)){
                      isThisPlayerExist=true;
                      break;
                  }
              }
              //////////////////////////
              if (!isThisPlayerExist){
                  players.get(side).add(user);
              }


          }else if (input.contains("->")){
              String side=input.split(" -> ")[1];
              String user=input.split(" -> ")[0];

              for (List<String> users : players.values()) {
                  users.remove(user);

              }
              if (players.containsKey(side)){

                players.get(side).add(user);
              }else{
                  players.put(side,new ArrayList<>());
                  players.get(side).add(user);
              }
              System.out.printf("%s joins the %s side!%n",user,side);
          }


        input=scanner.nextLine();
      }

        for (Map.Entry<String, List<String>> entry : players.entrySet()) {

            String side=entry.getKey();
            List<String>users=entry.getValue();
             if (!users.isEmpty()){
                 System.out.printf("Side: %s, Members: %d%n",side,users.size());
                 users.forEach(user -> System.out.println("! "+ user));
             }
        }
    }
}
