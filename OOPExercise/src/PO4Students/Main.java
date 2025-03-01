package PO4Students;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         int n=Integer.parseInt( scanner.nextLine());
        List<Student> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String [] arr=scanner.nextLine().split(" ");
            String firstName=arr[0];
            String lastName=arr[1];
            double grade =Double.parseDouble(arr[2]);
            Student student=new Student(lastName,grade,firstName);
            people.add(student);

        }
      people.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student person : people) {
            System.out.printf("%s %s: %.2f%n",person.getFirstName(),person.getLastName(),person.getGrade());
        }
    }
}
