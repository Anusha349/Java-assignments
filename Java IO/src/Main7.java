import java.io.*;
public class Main7
{
  public static void main(String[] args)throws Exception
  {
  File file = new File("Concatination1.txt");
  BufferedReader br = new BufferedReader(new FileReader(file));
  String st;
  while ((st = br.readLine()) != null)
    System.out.println(st);
  }
}