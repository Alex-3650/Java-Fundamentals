import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

public class POST2 {
    public static void main(String[] args) throws IOException {
        String body = "{\"name\": \"Auid Rs5\", \"data\": { \"year\": \"2022\", \"Price\": \"100.000\" }}";

        /*HashMap<String, Object>carAttributes=new HashMap<>();

        carAttributes.put("year","2022");
        carAttributes.put("Price","100.000");
        carAttributes.put("color","Black");
       Car car1= new Car("Audi Rs5",carAttributes);
        */
        URL url = new URL("https://api.restful-api.dev/objects");
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0");

        try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
            dos.writeBytes(body);
        }

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            String line;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
