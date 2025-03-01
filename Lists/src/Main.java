import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> numberList=new ArrayList<>() ;




         numberList.add("Ivan");
        numberList.add("George");
        numberList.add("Petar");
        numberList.add(1,"Michael");
        System.out.println(numberList.size());

        numberList.remove("George");
        numberList.remove(1);


        System.out.println(numberList.get(1));
        for (int i = 0; i < numberList.size()-1 ; i++) {

            System.out.println(numberList.get(i));
            System.out.println((numberList));



        }
        for (String text:numberList){
            System.out.println(text);
        }


        System.out.println(numberList.isEmpty());
    }
}