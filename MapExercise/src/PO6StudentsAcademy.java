import javax.naming.InsufficientResourcesException;
import java.awt.image.ImageProducer;
import java.util.*;

public class PO6StudentsAcademy {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         int n=Integer.parseInt( scanner.nextLine());
        Map<String, Double>school=new LinkedHashMap<>();
        Map<String, Integer>count=new LinkedHashMap<>();

          int counter=1;
        for (int i = 0; i < n; i++) {


            String student=scanner.nextLine();
            double grade=Double.parseDouble(scanner.nextLine());

            if (!school.containsKey(student)){
                school.put(student,grade);
                count.put(student,1);

            }else{
                double currentGrade=school.get(student);
                school.put(student,currentGrade+grade);
               int currentCount= count.get(student);
                count.put(student,currentCount+1);
            }
        }

        for (Map.Entry<String, Double> entry : school.entrySet()) {
            int divisor=count.get(entry.getKey());
            double average=entry.getValue()/divisor;
            if (average<4.5){
                continue;
            }
            System.out.printf("%s -> %.2f\n",entry.getKey(),average);


        }
    }
}
