package HTML;

import java.util.Arrays;
import java.util.Scanner;

public class PO5TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] arr = Arrays.stream
                        (scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).
                toArray();
        int min=Integer.MIN_VALUE;
        int [] result=new int[arr.length];

        for (int i = arr.length-1; i >=0 ; i--) {
           if (arr[i]>min){

               result[count]=arr[i];
               count++;
               min=arr[i];

           }
        }
        for (int i = count-1; i >=0 ; i--) {
            System.out.print(result[i]+ " ");

        }
    }
}
