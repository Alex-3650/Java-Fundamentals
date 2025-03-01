import java.util.Scanner;

public class PO6MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String text=scanner.nextLine();
        printMiddle(text);

    }
    public static void printMiddle(String text){

        if (text.length()%2==1){
            System.out.println(text.charAt((text.length()-1)/2));
        }else{
            System.out.print((char)text.charAt((text.length()/2-1))+""+ text.charAt((text.length()/2))) ;
        }
    }
}
