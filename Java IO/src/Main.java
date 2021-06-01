import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
 
class Main
{
    public static void main(String[] args)
    {
        File file = new File("Concatination1.txt");
 
        try (InputStream in = new FileInputStream(file))
        {
            String contents = IOUtils.toString();
            System.out.println(contents);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}