import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class IOException
{
    public void checkFileNotFound()
    {
        try
        {
            FileInputStream in = new FileInputStream("input.txt");
            System.out.println("This is not printed");
        } 
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        IOException example = new IOException();
        example.checkFileNotFound();
    }
}