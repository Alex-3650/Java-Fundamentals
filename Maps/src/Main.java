

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);


        HashMap <String, Double> studentsGrades=new HashMap<>();
        studentsGrades.put("Ivan",5.8);
        studentsGrades.putIfAbsent("George",4.67);
        studentsGrades.remove("George");
        studentsGrades.get("Ivan");

        System.out.println(studentsGrades.containsKey("Peter"));
        System.out.println(studentsGrades.containsValue(5.8));

        //iteration
     for (Map.Entry<String,Double> item:studentsGrades.entrySet()){
         System.out.println(item.getKey()+"->"+item.getValue());
     }



    }
}