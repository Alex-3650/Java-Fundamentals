import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(getGradeDescription(scanner.nextDouble()));


    }

        public static String getGradeDescription(double grade) {
            if (grade >= 2.00 && grade <= 2.99) {
                return "Fail";
            } else if (grade >= 3.00 && grade <= 3.49) {
                return "Poor";
            } else if (grade >= 3.50 && grade <= 4.49) {
                return "Good";
            } else if (grade >= 4.50 && grade <= 5.49) {
                return "Very good";
            } else if (grade >= 5.50 && grade <= 6.00) {
                return "Excellent";
            } else {
                return "Invalid grade";
            }
        }


}