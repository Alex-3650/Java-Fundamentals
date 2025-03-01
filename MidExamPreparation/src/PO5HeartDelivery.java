import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;
import java.util.Scanner;

public class PO5HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int [] arr= Arrays.stream
                        (scanner.nextLine().split("@")).
                mapToInt(Integer::parseInt).
                toArray();
        int index=0;

          String command=scanner.nextLine();
          while (!command.equals("Love!")){

               int num=Integer.parseInt(command.split(" ")[1]);
               index+=num;
              if (index>= arr.length) {
                  index=0;
              }
              if (arr[index]!=0) {
                  arr[index] -= 2;

                  if (arr[index]==0){
                      System.out.printf("Place %d has Valentine's day.%n",index);
                  }

              }else{
                  System.out.printf("Place %d already had Valentine's day.%n",index);
              }
           command=scanner.nextLine();
          }
        System.out.printf("Cupid's last position was %d.%n",index);
          if (Love(arr)==0){
              System.out.println("Mission was successful.");
          }else{
              System.out.printf("Cupid has failed %d places.",LoveHouse(arr));
          }
    }
    public static int Love(int arr[]){
        int sum=0;
        for (int house:arr){
            sum+=house;
        }
        return sum;
    }
    public static int LoveHouse(int arr[]){
        int sum=0;
        for (int house:arr){
            if (house>0){
                sum++;
            }
        }
        return sum;
    }

}
