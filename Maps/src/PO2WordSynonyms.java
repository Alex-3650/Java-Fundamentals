import java.util.*;

public class PO2WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordCounts=Integer.parseInt( scanner.nextLine());

        Map<String, List<String>> map=new LinkedHashMap<>();

        for (int i = 1; i <=wordCounts ; i++) {
            String word=scanner.nextLine();
            String synonym= scanner.nextLine();

            map.putIfAbsent(word,new ArrayList<>());


            map.get(word).add(synonym);
        }

        for (Map.Entry<String,List<String>> entry:map.entrySet()){

            System.out.println(entry.getKey()+" - "+String.join(", ", entry.getValue()));

        }
    }
}
