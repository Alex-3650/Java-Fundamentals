import java.util.Scanner;

public class PO4Task {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


      double foodPig=Double.parseDouble(scanner.nextLine());
      double hayPig=Double.parseDouble(scanner.nextLine());
        double coverPig=Double.parseDouble(scanner.nextLine());
        double weightPig=Double.parseDouble(scanner.nextLine());
        double food=1000*foodPig;
        double hay=1000*hayPig;
        double cover=1000*coverPig;
        double weight=1000*weightPig;
        boolean flag=false;

        while(true){
            if (food<300||hay<0.05*food||cover<weight/3){
                System.out.println("Merry must go to the pet store!");
                break;
            }
            for (int i = 1; i <=30 ; i++) {
                if (food<300||hay<0.05*food||cover<weight/3){
                    break;
                }
               food-=300;
               if (i%2==0){
                   hay-=0.05*food;
               }
               if (i%3==0){
                   cover-=weight/3;
               }
               if (i==30){
                   flag=true;
                   break;
               }
            }
            if (flag){
                break;
            }
        }


       if (food>=300&&hay>=0.05*food&&cover>=weight/3){
           System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",food/1000,hay/1000,cover/1000);
       }

    }
}
