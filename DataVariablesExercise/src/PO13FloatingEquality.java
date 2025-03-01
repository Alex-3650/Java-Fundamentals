import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class PO13FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double firstNum=Double.parseDouble(scanner.nextLine());
        double secondNum=Double.parseDouble(scanner.nextLine());
        if (Math.abs(firstNum-secondNum)<0.000001){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
