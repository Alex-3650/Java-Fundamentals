import java.util.Arrays;
import java.util.Scanner;

public class PO10TheLift {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int num=Integer.parseInt(scanner.nextLine());
       int sum=0;
       int num2=num;
       int mark=0;

        int[] spots= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean flag=false;
          int freeSeat=0;


            for (int i = 0; i < spots.length; i++) {
                while(spots[i]<4){

                    spots[i]++;
                    num--;
                    mark++;

                    if (num==0){
                        flag=true;
                        break;
                    }
                }
            if (flag)
                break;
            }

        for (int seats:spots){
            sum+=seats;
        }

        if (sum<4*spots.length){
            System.out.println("The lift has empty spots!");
        }else{

            System.out.println("There isn't enough space! "+ Math.abs(num2-mark) + " people in a queue!");
        }
        for (int nums:spots){
            System.out.print(nums+" ");
        }

    }
}
