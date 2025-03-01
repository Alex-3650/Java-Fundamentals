import java.util.Scanner;

public class PO10TopNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 8; i <=n ; i++) {
         if (checkSumDivisionBy8(i) && checkOddDigit(i)){
             System.out.println(i);
         }
        }
    }
    public static boolean checkSumDivisionBy8(int number){
        int sum=0;
        boolean division=false;
        while(number>0){
            sum+=number%10;

            number/=10;
        }
        return sum%8==0;
    }

    public static boolean checkOddDigit(int number){
        int n=0;
        int count=0;
        while(number>0) {
            n=number%10;
            if (n%2==1){
                return true;
            }else{
                number/=10;
            }

        }
        return false;
    }
}
