import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String filePath="C:\\Users\\georg\\Fundamentals_SoftUni\\MusicPlayer\\src\\Morning Surf in Cabo - Cumbia Deli.wav";

        File file =new File(filePath);

        try( Scanner scanner = new Scanner(System.in)){

            AudioInputStream audiStream= AudioSystem.getAudioInputStream(file);
           Clip clip =AudioSystem.getClip();
           clip.open(audiStream);


           String response="";
           while (!response.equals("Q")){

               System.out.println("P = Play");
               System.out.println("S = Stop");
               System.out.println("R = Reset");
               System.out.println("Q = Quit");
               System.out.print("Enter your choice: ");


               response=scanner.nextLine().toUpperCase();
               System.out.println("==================");

               switch (response){

                   case "P"->clip.start();
                   case "S"->clip.stop();
                   case "R"->clip.setMicrosecondPosition(0);
                   case "Q"->clip.close();
                   default -> System.out.println("Invalid choice");

               }

           }

        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }

        catch (IOException e){
            System.out.println("Something went wrong");
        }

        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");;
        }
        finally{
            System.out.println("Bye");

        }
    }
}