import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
   public static void main(String[] args) {
      FileOutputStream fos = null;
      File file;
      String mycontent = "This is my Data which needs" +
	     " to be written into the file";
      try {
         
	  file = new File("Concatination1.txt");
	  fos = new FileOutputStream(file);
	  if (!file.exists()) {
	     file.createNewFile();
	  }

	  byte[] bytesArray = mycontent.getBytes();
	  fos.write(bytesArray);
	  fos.flush();
	  System.out.println("File Written Successfully");
       } 
       catch (IOException ioe) {
	  ioe.printStackTrace();
       } 
       finally {
	  try {
	     if (fos != null) 
	     {
		 fos.close();
	     }
          } 
	  catch (IOException ioe) {
	     System.out.println("Error in closing the Stream");
	  }
       }
   }
}