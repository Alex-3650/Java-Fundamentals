import java.util.Scanner;

public class PO1Task1 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int biscuitsPerDay=Integer.parseInt( scanner.nextLine());
         int workers=Integer.parseInt( scanner.nextLine());
         int competingFactory=Integer.parseInt( scanner.nextLine());;
         double sum=0;

        for (int i = 1; i <=30 ; i++) {
            int productivity=biscuitsPerDay*workers;
        if (i%3!=0){
            sum+=productivity;
        }else{
            sum+=Math.floor((productivity*0.75));
        }

        }
        System.out.printf("You have produced %.0f biscuits for the past month.%n",sum);
        if (sum>competingFactory){
            double difference=sum-competingFactory;
            double percentage= (difference/competingFactory)*100;
            System.out.printf("You produce %.2f percent more biscuits.",percentage);
        }else{
            double difference=competingFactory-sum;
            double percentage= (difference/competingFactory)*100;
            System.out.printf("You produce %.2f percent less biscuits.",percentage);
        }
    }
}
