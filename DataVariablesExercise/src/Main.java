import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i = 1; i <= n; i++) {

            String[] arr= scanner.nextLine().split(" ");
             int [] arr1=new int[arr.length];
             for (int j = 0; j < arr.length; j++) {

                 arr1[j]=Integer.parseInt(arr[j]);
             }
            if (arr1[0]>arr1[1]) {
                while(arr1[0]>0){
                    int num=arr1[0]%10;
                    sum+=num;

                    arr1[0]/=10;

                }

            }
            else{
                while(arr1[1]>0){
                    int num=arr1[1]%10;
                    sum+=num;

                    arr1[1]/=10;

                }

            }
            System.out.println(sum);
            sum=0;


        }


    }
}