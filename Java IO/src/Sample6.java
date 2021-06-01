import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Sample6 {

    public static void main(String[] args) throws IOException {

        String fileName = "‪StringTwice1.txt";

        try (FileWriter fr = new FileWriter(fileName)) {

            fr.write("Today is a sunny day");
        }
    }
}
