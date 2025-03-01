package songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int count=Integer.parseInt(scanner.nextLine());
        List<Song> songCollection=new ArrayList<>();
        for (int i = 1; i <=count ; i++) {

            String input= scanner.nextLine();
            String [] data=input.split("_");
            String typeList=data[0];
            String name=data[1];
            String time=data[2];

            Song song= new Song(typeList,name,time);

            songCollection.add(song);
        }
        String command=scanner.nextLine();

        if (command.equals("all")){
            for (Song song : songCollection) {
                System.out.println(song.getName());
            }
        }else {
            for (Song song : songCollection) {
             if (song.getTypeList().equals(command)){
                 System.out.println(song.getName());
             }
            }
        }
    }
}
