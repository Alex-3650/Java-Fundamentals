import java.util.Scanner;

public class PO5Message {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=Integer.parseInt(scanner.nextLine());

        int lastNum=num%10;
        if (lastNum==0){
            System.out.println("zero");
        }
        else if (lastNum==1){
            System.out.println("one");
        }
        else if (lastNum==2){
            System.out.println("two");
        }
        else if (lastNum==3){
            System.out.println("three");
        }
        else if (lastNum==4){
            System.out.println("four");
        }
        else if (lastNum==5){
            System.out.println("five");
        }
        else if (lastNum==6){
            System.out.println("six");
        }
        else if (lastNum==7){
            System.out.println("seven");
        }
        else if (lastNum==8){
            System.out.println("eight");
        }
        else if (lastNum==9){
            System.out.println("nine");
        }

    }
}
