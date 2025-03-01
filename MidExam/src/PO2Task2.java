import java.util.*;
import java.util.stream.Collectors;

public class PO2Task2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

       List<String> coffe = Arrays.stream(scanner.nextLine().split(" "))
               .collect(Collectors.toList());


         int n=Integer.parseInt( scanner.nextLine());

        for (int i = 0; i < n ;i++) {
            String text= scanner.nextLine();
            String command=text.split(" ")[0];

            switch (command){

              case"Include"->{
                  String coffeeType=text.split(" ")[1];
                  coffe.add(coffeeType);
              }
              case "Remove"->{

                  String Type=text.split(" ")[1];
                  int count=Integer.parseInt(text.split(" ")[2]);
                  int index=0;
                  int num=count;
                  if (Type.equals("last")){
                      index=coffe.size();
                      num=index-count;
                  }
                  if (count<=coffe.size()){
                      if (Type.equals("first")) {
                          coffe.subList(index, num).clear();
                      }else{
                          coffe.subList(num,index).clear();
                      }
                  }
              }
              case "Prefer"->{
                  int index1=Integer.parseInt(text.split(" ")[1]);
                  int index2=Integer.parseInt(text.split(" ")[2]);
                  if (index1>=0&&index1<coffe.size() &&index2>=0&&index2<coffe.size()){
                      String swap=coffe.get(index1);
                      String second=coffe.get(index2);
                      coffe.set(index1,second);
                      coffe.set(index2,swap);
                  }

              }
              case "Reverse"->{
                  Collections.reverse(coffe);
              }
            }

        }
        System.out.println("Coffees:");
        System.out.println(coffe.toString()
                .replace("[","")
                .replace("]","")
                .replaceAll(",","")                                );
    }
}
