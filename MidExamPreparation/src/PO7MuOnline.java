import java.util.Arrays;
import java.util.Scanner;

public class PO7MuOnline {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int health=100;
        int bitcoin=0;


        String [] arr= scanner.nextLine().split("\\|");



        for (int i = 0; i <arr.length ; i++) {
         String command=arr[i];
         String text=command.split(" ")[0];
         int number=Integer.parseInt(command.split(" ")[1]);

         if (text.equals("potion")){
         if (health+number>100){
             number=100-health;
         }
             health+=number;
             System.out.printf("You healed for %d hp.%n",number);
             System.out.printf("Current health: %d hp.%n",health);
         } else if (text.equals("chest")) {
             bitcoin+=number;
             System.out.printf("You found %d bitcoins.%n",number);
             
         }else{
                 health-=number;
             if (health<=0){
                 System.out.printf("You died! Killed by %s.%n",text);
                 System.out.printf("Best room: %d%n",i+1);
                 break;
             }
                 System.out.printf("You slayed %s.%n",text);



         }
        }
        if (health>0){
            System.out.println("You've made it!");
            System.out.println("Bitcoins: "+ bitcoin);
            System.out.println("Health: "+ health);
        }

    }
}
