import java.util.Scanner;

public class PO2CommonElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] arr1=scanner.nextLine().split(" ");
        String[] arr2=scanner.nextLine().split(" ");

        for (int position = 0; position < arr2.length; position++) {
        String currentText=arr2[position];

            for (int index = 0; index < arr1.length; index++) {

                if (currentText.equals(arr1[index])){
                    System.out.print(currentText+ " ");
                }
                
            }
        }
    }
}
