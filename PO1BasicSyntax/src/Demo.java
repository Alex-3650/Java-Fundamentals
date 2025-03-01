import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int height = 6;
        int width = 4;

        for (int i = 1; i <=height ; i++) {
            for (int j = 1; j <=width ; j++) {

                if (i==1|| i==height|| j==1|| j==width){

                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
