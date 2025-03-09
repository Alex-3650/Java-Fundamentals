import java.util.Scanner;

public class PO2CharacterMultiplier {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int sum=0;

         String [] text =scanner.nextLine().split(" ");

         String convert="";
         if (text[0].length()>text[1].length()){
             convert=text[0];
             text[0]=text[1];
             text[1]=convert;
         }

      int n =text[0].length();
        int m=text[1].length();
         char [] arr=text[0].toCharArray();
        char [] arr2=text[1].toCharArray();

        for (int i = 0; i < n ; i++) {
            int multiply=(int)arr[i]*(int)arr2[i];
            sum+=multiply;
        }
        if (arr2.length>arr.length){
            for (int i = n; i < m; i++) {

                sum+=(int)arr2[i];
            }
        }
        System.out.println(sum);
    }
}
