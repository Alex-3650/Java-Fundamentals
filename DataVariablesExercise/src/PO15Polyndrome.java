import java.util.Scanner;

public class PO15Polyndrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int num2=n;
        int num=0;
        while(n>0){
          num=num*10+(n%10) ;


            n/=10;

        }
        if(num==num2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
