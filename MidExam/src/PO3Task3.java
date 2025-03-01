import java.util.Arrays;
import java.util.Scanner;

public class PO3Task3 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


        int [] arr= Arrays.stream
                        (scanner.nextLine().split(", ")).
                        mapToInt(Integer::parseInt).
                        toArray();

        int index=Integer.parseInt(scanner.nextLine() );
        String type= scanner.nextLine();

        int sumLeft=0;
        int sumRight=0;
        for (int i = 0; i < index; i++) {
            if (type.equals("cheap")){
                if (arr[i] < arr[index]) {
                    sumLeft+=arr[i];
                }
            }else{
                if (arr[i] >= arr[index]){
                    sumLeft+=arr[i];
                }
            }
        }
        for (int i = index+1; i <arr.length ; i++) {
            if (type.equals("cheap")){
                if (arr[i] < arr[index]) {
                    sumRight+=arr[i];
                }
            }else{
                if (arr[i] >= arr[index]){
                    sumRight+=arr[i];
                }
            }

        }

         if(sumLeft>=sumRight){
            System.out.println("Left - "+ sumLeft);
        }else{
             System.out.println("Right - "+ sumRight);
         }

    }
}
