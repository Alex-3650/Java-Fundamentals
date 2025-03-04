import java.util.*;

public class PO8CompanyUser {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String command=scanner.nextLine();
        Map<String, List<String>> map=new LinkedHashMap<>();

         while (!command.equals("End")){
             String [] companyInfo=command.split(" -> ");
             String company=companyInfo[0];
             String employee=companyInfo[1];

             if (!map.containsKey(company)){

                 map.put(company,new ArrayList<>());
             }
             if (!map.get(company).contains(employee)){
                 map.get(company).add(employee);
             }

             command= scanner.nextLine();
         }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {

            System.out.println(entry.getKey());
            List<String>arr=entry.getValue();
            for (int i = 0; i < arr.size() ; i++) {
                System.out.println("-- "+ arr.get(i));

            }

        }
    }
}
