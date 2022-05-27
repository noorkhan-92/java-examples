package http;

//Example 5.9A HTTP Client
import java.net.*;
import java.io.*;

public class HTTPClient {

    public static void main(String[] args) throws Exception {
        URL u = new URL("http://talkkia.ddns.net:8081/api/user/allusers");
        URLConnection uc = u.openConnection();
        for (int i = 0; i < 10; i++) {
            long start = java.lang.System.currentTimeMillis();
            HttpURLConnection conn = (HttpURLConnection) u.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    conn.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
            System.out.println(java.lang.System.currentTimeMillis() - start);
        }
    }
}
