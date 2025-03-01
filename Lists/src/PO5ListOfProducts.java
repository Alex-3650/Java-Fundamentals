import java.util.*;

public class PO5ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String>productsList=new ArrayList<>();

        int productCount=Integer.parseInt( scanner.nextLine());
        for (int i = 0; i < productCount; i++) {
            String product=scanner.nextLine();
            productsList.add(product);

        }
        Collections.sort(productsList);


        int number=1;
        for (String product:productsList ){
            System.out.println(number+ "."+product);
            number++;
        }
    }
}
