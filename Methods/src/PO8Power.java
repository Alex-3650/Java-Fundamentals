import java.util.Scanner;

public class PO8Power {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int n=scanner.nextInt();
        power(num,n);
    }

    public static void power(int num,int n){
        int number=1;
        for (int i = 1; i <=n ; i++) {


            number*=num;

        }
        System.out.println(number);
    }
}
