import java.util.Scanner;

public class zigzag {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String[] arr1=new String[n];
        String[] arr2=new String[n];

        for (int i = 1; i <= n; i++) {
            String input=scanner.nextLine();
            String text1=input.split(" ")[0];
            String text2=input.split(" ")[1];
            if (i%2==1){
                arr1[i-1]=text1;
                arr2[i-1]=text2;
            }else{

                arr1[i-1]=text2;
                arr2[i-1]=text1;
            }

        }
        for (String s : arr1) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : arr2) {
            System.out.print(s + " ");
        }

    }
}
