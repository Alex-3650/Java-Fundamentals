import java.util.Scanner;

public class PO1SignOfaInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
          printInteger(scanner.nextInt());

    }
    public static void printInteger(int n){
        if (n>0){
            System.out.printf("The number %d is positive.",n);
        }
        else if (n==0){
            System.out.printf("The number %d is 0.",n);
        }
        else{
            System.out.printf("The number %d is negative.",n);
        }
    }
}
