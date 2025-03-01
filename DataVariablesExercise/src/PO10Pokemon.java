import java.util.Scanner;

public class PO10Pokemon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int power=Integer.parseInt(scanner.nextLine());
        int oldPower=power;
        int distance=Integer.parseInt(scanner.nextLine());
        int exhaustion=Integer.parseInt(scanner.nextLine());
        int count=0;
        while(distance<=power){
            count++;
            power-=distance;


            if (power==oldPower/2 && exhaustion!=0){

                    power /= exhaustion;

            }

        }
        System.out.println(power);
        System.out.println(count);
    }
}
