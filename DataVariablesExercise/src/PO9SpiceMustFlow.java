import java.util.Scanner;

public class PO9SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int start=Integer.parseInt(scanner.nextLine());
        int spices=0;
        int day=0;
        while(start>=100){
           spices+=start;

           spices-=26;



            start-=10;
            day++;
        }
        if (spices<26){
            spices=0;
        }
        else{
            spices-=26;
        }
        System.out.println(day);
        System.out.println(spices);
    }
}
