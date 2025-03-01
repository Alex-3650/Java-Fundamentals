import org.w3c.dom.css.CSSMediaRule;

import java.util.Scanner;

public class PO1SmallestofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         int n=Integer.parseInt(scanner.nextLine());
        int n2=Integer.parseInt(scanner.nextLine());
        int n3=Integer.parseInt(scanner.nextLine());
        SmallestNum(n,n2,n3);
    }
    public static void SmallestNum(int n1,int n2,int n3){

     if (n1<=n2 && n1<n3){
         System.out.println(n1);
     }else if(n2<=n1 && n2<n3){
         System.out.println(n2);
        }else{
         System.out.println(n3);
     }

    }
}
