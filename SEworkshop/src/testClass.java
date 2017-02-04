import java.net.*;
import java.io.*;

public class testClass {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("http://bleb.org/tv/data/listings/-1/4music.xml");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
     }
}