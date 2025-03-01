import java.util.Scanner;

public class PO6ComputerStore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String prices=scanner.nextLine();
        double sum=0;
        double currentSum=0;
        double finalSum=0;
        int number=0;

        while (!prices.equals("special")&&!prices.equals("regular")){

            double products=Double.parseDouble(prices);
            if (products<0){
                if (number==0){
                    System.out.println();
                }
                number++;
                System.out.println("Invalid price!");
                prices=scanner.nextLine();
                continue;
            }

            sum+=products;



            prices=scanner.nextLine();
        }

        currentSum=sum*1.2;
        finalSum=currentSum;

        if (prices.equals("special")){
            currentSum*=0.9;
        }
        if (currentSum==0){
            System.out.println("Invalid order!");
        }else{
               System.out.println("Congratulations you've just bought a new computer!");
               System.out.printf("Price without taxes: %.2f$%n",sum);
               System.out.printf("Taxes: %.2f$%n",finalSum-sum);
               System.out.println("-----------");
               System.out.printf("Total price: %.2f$",currentSum);
        }


    }
}
