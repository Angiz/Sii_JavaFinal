package Day5;

import java.io.*;
import java.net.*;


public class Buffers {
    public static void main(String[] args) {
        try {
            // url with web site
            URL url = new URL ("https://www.nbp.pl/xml/stopy_procentowe.xml");

            // stream to data read
            BufferedReader in = new BufferedReader (new InputStreamReader(url.openStream()));
            FileWriter fw = new FileWriter ("stopy_procentowe.xml");
            String str;
            while ((str = in.readLine()) != null) {
            // operation on single rows of returned data
            // System.out.println(str);
                fw.write(str + "\n");



            }
            try{
                fw.close();
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            ;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
