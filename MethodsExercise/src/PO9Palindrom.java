import java.util.Scanner;

public class PO9Palindrom {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        while(!text.equals("end")){
            int n=Integer.parseInt(text);
            if (palindrome(n)){
                System.out.println( "true");
            }else{
                System.out.println("false");
            }

            text=scanner.nextLine();
        }


    }
    public static boolean palindrome(int n){
        int number=0;
        int n2=n;
        while(n>0){
            number=(number+n%10)*10;



            n/=10;
        }
        return number/10==n2;

    }
}
