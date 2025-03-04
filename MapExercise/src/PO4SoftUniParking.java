import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PO4SoftUniParking {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


         Map<String,String> user=new LinkedHashMap<>();
            int n=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String[] text=scanner.nextLine().split("\\s+");
            String command=text[0];

            if (command.equals("register")) {
            String userName=text[1];
            String plate=text[2];
            if (user.containsKey(userName)){
                System.out.println("ERROR: already registered with plate number "+ plate);
            }else{
                user.put(userName,plate);
                System.out.printf("%s registered %s successfully\n",userName,plate);
            }

            }else if (command.equals("unregister")){
                String userName=text[1];
                if (!user.containsKey(userName)){
                    System.out.printf("ERROR: user %s not found%n",userName);
                }else{
                    user.remove(userName);
                    System.out.printf("%s unregistered successfully\n",userName);
                }
            }
        }
        for (Map.Entry<String, String> entry : user.entrySet()) {
            System.out.printf("%s => %s\n",entry.getKey(),entry.getValue());

        }
    }
}