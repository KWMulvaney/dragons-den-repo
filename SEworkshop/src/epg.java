import java.io.*;
import java.net.URL;

public class epg {

	public static void main(String[] args) throws IOException {
		
		 URL fourMusic = new URL("http://bleb.org/tv/data/listings/-1/4music.xml");
	        BufferedReader in = new BufferedReader(
	        new InputStreamReader(fourMusic.openStream()));
	        
	     FileWriter fw=new FileWriter("C:\\Users\\adavi\\Desktop\\SOFTWARE ENGINEERING WORKSHOP\tv channels\bbcOne.txt");

	        String inputLine;
	        while ((inputLine = in.readLine()) != null)
	            System.out.println(inputLine);
	        in.close();
		
	        fw.close();
	}

}
