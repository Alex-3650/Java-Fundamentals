package PO6OrdeRbyAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList=new ArrayList<>();
        
        String input= scanner.nextLine();
        while (!input.equals("End")){
        String [] strings=input.split(" ");
        String name=strings[0];
        String id=strings[1];
        int age= Integer.parseInt(strings[2]);
        Person person=new Person(age,id,name);
        personList.add(person);
            input= scanner.nextLine();
        }

        personList.sort(Comparator.comparing(Person::getAge));
        for (Person person : personList) {
            System.out.printf("%s with ID: %s is %d years old.\n",person.getName(),person.getId(),person.getAge());
        }
    }

}
