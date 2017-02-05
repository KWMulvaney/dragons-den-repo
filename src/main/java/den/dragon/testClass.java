package den.dragon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class testClass {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("http://bleb.org/tv/data/listings/-1/4music.xml");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}