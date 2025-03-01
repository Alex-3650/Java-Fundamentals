import java.util.Scanner;

public class PO1Train {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int finalCount=0;
        int n=Integer.parseInt(scanner.nextLine());
        int[] train=new int[n];
        for (int i = 0; i < n; i++) {
            int people=Integer.parseInt(scanner.nextLine());
            train[i]=people;
        }
        for (int sum:train){
            System.out.print(sum +" ");
          finalCount+=sum;
        }
        System.out.println();
        System.out.println(finalCount);
    }
}
