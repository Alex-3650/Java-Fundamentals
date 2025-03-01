import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P11kidsWithCandies {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int[] candies = new int[]{2,3,5,1,3};
        int a=3;
        System.out.println(kidsWithCandies(candies,a));


    }






    public  static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kids = new ArrayList<>();
      int max=0;
        for (int i = 0; i <candies.length ; i++) {
           if (candies[i]>max){
               max=candies[i];
           }
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies>=max){
                kids.add(true);
            }else{
                kids.add(false);
            }

        }
        return kids;
    }

}
