import com.sun.jdi.PathSearchingVirtualMachine;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;

public class PO8MagicSum {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int [] arr= Arrays.stream
                        (scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).
                toArray();
        
        int num=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length-1; i++) {
           int currentNum=arr[i];
            for (int j = i+1; j <= arr.length-1; j++) {
                int combination=currentNum+ arr[j];
              if (combination==num){
                  System.out.print(currentNum + " " + arr[j]);
                  System.out.println();
              }
            }
        }
    }
}
