import java.util.Scanner;

public class PO8FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());
        long factFirst=firstNumFactorial(firstNum);
        long factSecond=firstNumFactorial(secondNum);
        double result=factFirst*1.00/factSecond;
        System.out.printf("%.2f",result);
    }
    public static long firstNumFactorial(int Num)  {
        long n=1;
        for (int i = 1; i <=Num ; i++) {
        n*=i;
        }
        return n;
    }

}
