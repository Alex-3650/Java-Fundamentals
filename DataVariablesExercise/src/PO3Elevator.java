import java.util.Scanner;

public class PO3Elevator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int numberOfPeople=Integer.parseInt(scanner.nextLine());
        int capacity=Integer.parseInt(scanner.nextLine());

        int loop = numberOfPeople/capacity;
        if (numberOfPeople%capacity!=0){
            loop+=1;

        }
        System.out.println(loop);
    }
}
