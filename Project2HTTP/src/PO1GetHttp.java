import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class PO1GetHttp {
    public static void main(String[] args) {
        String url="https://jsonplaceholder.typicode.com/posts/1";
        try {


            URL obj = new URL(url);

            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            System.out.println("Response code: " + responseCode);


            StringBuffer response = null;
            if (responseCode == HttpURLConnection.HTTP_OK) {
                String inputLine;
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                System.out.println("Response: " + response.toString());
            }

            else{
                System.out.println("GET request failed.");

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
