import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class PO3CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        char symbol=scanner.nextLine().charAt(0);
        char symbol2=scanner.nextLine().charAt(0);
        symbolRange(symbol,symbol2);

    }
    public static void symbolRange(char s,char s2){



        if (s<s2){
            for (char symbol = (char)(s+1); symbol <s2 ; symbol++) {
                System.out.print(symbol+" ");
            }
        }else{
            for (char symbol = (char)(s2+1); symbol <s ; symbol++) {
                System.out.print(symbol+" ");
            }
        }
    }
}
