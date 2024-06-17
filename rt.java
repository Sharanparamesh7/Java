import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class rt{
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("path/to/textfile.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}