import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class PO3GetHttp2 {
    public static void main(String[] args) throws IOException {


        URL url=new URL("https://jsonplaceholder.typicode.com/posts/1");

        HttpURLConnection connection=(HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        int responseCode=connection.getResponseCode();

        if (responseCode==HttpURLConnection.HTTP_OK){
            System.out.println("Reasponse code: " + responseCode);
            StringBuilder sb=new StringBuilder();
            Scanner scanner=new Scanner(connection.getInputStream());
            while(scanner.hasNext()){
                sb.append(scanner.nextLine());

            }
            System.out.println(sb);

        }else{
            System.out.println("Error is sending a GET request");
        }

    }
}
