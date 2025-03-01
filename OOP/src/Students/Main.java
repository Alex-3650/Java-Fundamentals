package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input=scanner.nextLine();
        List<Student> listStudent=new ArrayList<>();
        List <Boolean> dublicate= new ArrayList<>();

         while (!input.equals("end")){
         String [] arrayStudents=input.split(" ");
          String firstName=arrayStudents[0];
          String secondName=arrayStudents[1];
           int age=Integer.parseInt(arrayStudents[2]);
           String homeTown=arrayStudents[3];
           Student student=new Student(age,firstName,secondName,homeTown);

           listStudent.add(student);

             input=scanner.nextLine();
         }
         String town= scanner.nextLine();
        for (Student student : listStudent) {
            if (student.getHomeTown().equals(town)){
                System.out.printf("%s %s is %d years old\n",student.getFirstName(),student.getSecondName(),student.getAge());
            }
        }
    }
}
