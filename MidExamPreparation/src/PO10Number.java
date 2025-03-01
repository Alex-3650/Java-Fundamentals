import java.util.*;

public class PO10Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number=new ArrayList<>();
              int [] numbers= Arrays.stream
                        (scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).
                toArray();

        double sum=0;
        for (int n:numbers){
          sum+=n;
        }
        sum/=numbers.length;
        int counter=0;
        for (int num:numbers){

            if (num>sum){
                number.add(num);
            }

        }
        number.sort(Collections.reverseOrder());
        if (!number.isEmpty()){
            for (int i = 0; i <number.size() ; i++) {
                if (i==5){
                    break;
                }
                System.out.print(number.get(i) +" ");

            }



        }else{
            System.out.println("No");
        }

    }
}
