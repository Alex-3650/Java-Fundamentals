import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class Main {
    public static void main(String[] args) throws MalformedURLException {
                  try {


                      URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");
                      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                      conn.setRequestMethod("GET");
                      int responseCode = conn.getResponseCode();

                      System.out.println("Response code: " + responseCode );


                      BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                      String line;

                      while ((line = reader.readLine()) != null) {
                          System.out.println(line);
                      }
                      reader.close();

                  }catch (Exception e) {
                      e.printStackTrace();
                  }
    }
}