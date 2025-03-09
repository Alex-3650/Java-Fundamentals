import java.util.Scanner;

public class PO3ExtractFile {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String [] input=scanner.nextLine().split("\\\\");
         String []type =input[input.length-1].split("\\.");
        System.out.println("File name: "+type[0]);
        System.out.println("File extension: "+type[1]);
    }
}
