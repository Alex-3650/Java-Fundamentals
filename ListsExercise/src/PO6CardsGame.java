import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO6CardsGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> player1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> player2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while(!player1.isEmpty()){
            if (player2.isEmpty()){
                break;
            }
            int one=player1.getFirst();
            int second=player2.getFirst();

            if (one>second){
                int card=player1.getFirst();
                player1.removeFirst();
                player1.add(card);
                player1.add(player2.getFirst());
                player2.removeFirst();
            }else if (second>one){
                int card=player2.getFirst();
                player2.removeFirst();
                player2.add(card);
                player2.add(player1.getFirst());
                player1.removeFirst();
            }else{
                player1.removeFirst();
                player2.removeFirst();
            }
        }
        int sum=0;
        if (player1.isEmpty()){
            for (int card: player2){
                sum+=card;
            }
            System.out.println("Second player wins! Sum: " + sum);
        }else {
            for (int card : player1) {
                sum += card;
            }
            System.out.println("First player wins! Sum: " + sum);
        }


    }
}
