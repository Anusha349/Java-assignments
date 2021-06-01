import java.io.*;
  
public class FileNotFound
{
  public static void main(String[] args) throws IOException 
  {
    FileReader reader = new FileReader("file.txt");
    BufferedReader br = new BufferedReader(reader);
    String data =null;
    while ((data = br.readLine()) != null) 
    {
        System.out.println(data);
    }
    br.close();
  }
}