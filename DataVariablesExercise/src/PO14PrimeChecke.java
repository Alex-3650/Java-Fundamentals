import java.util.Scanner;

public class PO14PrimeChecke {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        String output="";

        for (int i = 2; i <=n ; i++) {

            if (i % 2 == 0 && i != 2 ){
             output="false ";
            }
            else{
                output="True ";
            }
            if (i!=3&&i%3==0){
                output="false";
            }
            System.out.printf("%d -> %s%n",i,output);
        }
    }
}
