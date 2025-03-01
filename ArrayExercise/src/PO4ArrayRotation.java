import java.util.Arrays;
import java.util.Scanner;

public class PO4ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int [] arr= Arrays.stream
                (scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).
                toArray();

        int n=Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <=n ; i++) {

            int firstNum=arr[args.length-1];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=firstNum;


        }
        for (int num:arr){
            System.out.print(num+ " ");
        }
    }
}
