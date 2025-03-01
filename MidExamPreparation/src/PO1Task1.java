import java.util.Scanner;

public class PO1Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int initialEnergy=Integer.parseInt(scanner.nextLine());
        int countWin=0;
        String input=scanner.nextLine();

        while (!input.equals("End of battle")){

            int distance=Integer.parseInt(input);
            if (initialEnergy>=distance){
                initialEnergy-=distance;
                countWin++;
            }else{
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",countWin,initialEnergy);
                return;
            }
            if (countWin%3==0){
                initialEnergy+=countWin;
            }

          input=scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d",countWin,initialEnergy);
    }
}
