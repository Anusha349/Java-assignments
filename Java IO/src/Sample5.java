import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
class Sample5{
    public static void main(String[] args)
    {
        File file = new File("Concatination1.txt");
 
        try (FileReader fr = new FileReader(file))
        {
            int content;
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
