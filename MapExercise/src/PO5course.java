import java.util.*;

public class PO5course {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String input=scanner.nextLine();

        Map<String , List<String>> map=new LinkedHashMap<>();

         while(!input.equals("end")){


             String courseName=input.split(" : ")[0];
             String student=input.split(" : ")[1];

             map.putIfAbsent(courseName,new ArrayList<>());
           map.get(courseName).add(student);
             input = scanner.nextLine();
         }

        for (Map.Entry<String, List<String>> courseName : map.entrySet()) {
            String coursename=courseName.getKey();
            List <String> studentName=courseName.getValue();
            System.out.println(coursename+ ": "+studentName.size());

            studentName.forEach(name -> System.out.println("-- "+name));
        }
    }
}
