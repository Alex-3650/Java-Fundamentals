import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PO2PostHttp {
    public static void main(String[] args) {
        String url="https://jsonplaceholder.typicode.com/posts";
        String jsonData="{ \"userId\": \"1\", \"body\": \"bar\", \"title\": \"foo\" }";

        try{
            URL obj= new URL(url);

            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();


            connection.setRequestMethod("POST");


            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");


            connection.setDoOutput(true);

            try(OutputStream os = connection.getOutputStream()){

                byte[] input= jsonData.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
            int responseCode = connection.getResponseCode();
            System.out.println("Response code: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_CREATED) {
                System.out.println("Resource created successfully.");
            } else {
                System.out.println("POST request failed.");
            }


        }catch (Exception e){
           e.printStackTrace();

        }
    }
}
