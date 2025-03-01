import java.util.Scanner;

public class PO8BeerKegs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double maxNum=0;
        String name=" ";
     int n=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n; i++) {

            String model=scanner.nextLine();
            double radius=Double.parseDouble(scanner.nextLine());
            int height=Integer.parseInt(scanner.nextLine());
            double volume=Math.PI*radius*radius*height;
            if (volume>maxNum){
                maxNum=volume;
                name=model;

            }

        }

        System.out.println(name);

    }
    
}
