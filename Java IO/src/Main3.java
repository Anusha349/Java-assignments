import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
 
public class Main3 {
 
    public static void main(String a[]){
         
        InputStream is = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        try {
            is = new FileInputStream("Concatination1.txt");
            bis = new BufferedInputStream(is);
            dis = new DataInputStream(bis);
            String temp = null;
            while((temp = dis.readLine()) != null){
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}