import java.util.Scanner;

public class PO3Triangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
     rows(n);
     decrease(n);

    }
    public static void rows(int row){

        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void decrease(int row){
        for (int i = row-1; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

    }

}
