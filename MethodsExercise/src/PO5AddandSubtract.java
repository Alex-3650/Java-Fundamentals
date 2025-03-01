import java.util.Scanner;

public class PO5AddandSubtract {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int first=Integer.parseInt(scanner.nextLine());
        int second=Integer.parseInt(scanner.nextLine());
        int third=Integer.parseInt(scanner.nextLine());
        System.out.println(Subtract(first,second,third));
    }
    public static int Sum(int n,int n2){

        return n+n2;
    }
    public static int Subtract(int n,int n2,int n3){

        return Sum(n, n2)-n3;
    }
}
