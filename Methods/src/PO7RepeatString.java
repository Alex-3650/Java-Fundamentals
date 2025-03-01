import java.util.Scanner;

public class PO7RepeatString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String repeat=scanner.nextLine();
        int num=Integer.parseInt(scanner.nextLine());
        repetition(repeat,num);
    }
    public static void repetition(String text,int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(text);
        }

    }
}
