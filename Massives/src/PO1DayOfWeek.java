import java.util.Scanner;

public class PO1DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] week = { "Invalid day!", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int day=Integer.parseInt(scanner.nextLine());
        System.out.println(week[day]);
    }
}
