import java.util.Scanner;

public class PO11SnowBall {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

       double highestValue=0;
       int ballSnow=0;
       int ballTime=0;
       int ballQuality=0;

        for (int i = 1; i <=n ; i++) {

            int snowballSnow=Integer.parseInt(scanner.nextLine());
            int  snowballTime=Integer.parseInt(scanner.nextLine());
            int snowballQuality=Integer.parseInt(scanner.nextLine());
             double snowballValue=Math.pow(snowballSnow*1.00 / snowballTime,snowballQuality);
            if (snowballValue>highestValue){
                highestValue=snowballValue;
                ballSnow=snowballSnow;
                ballTime=snowballTime;
                ballQuality=snowballQuality;

            }

        }
        System.out.printf("%d : %d = %.0f (%d)",ballSnow,ballTime,highestValue,ballQuality);
    }
}
