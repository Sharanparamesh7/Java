import java.net.*;
import java.io.*;

public class net{
   public static void main(String[] args) throws Exception {
      URL url = new URL("https://sites.google.com/d/11iGkmmq6tPNzoib1JCc5QCqbRB7fg0zM/p/1vYC-TznnJuDqdU5a535p13JRtr25jCBJ/edit");
      URLConnection conn = url.openConnection();
      
      BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      
      String line;
      while ((line = reader.readLine()) != null) {
         System.out.println(line);
      }
      
      reader.close();
   }
}

