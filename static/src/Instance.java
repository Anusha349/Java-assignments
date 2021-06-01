import java.io.*;
public class Instance {
   int x=10;
   int y=20;
   static void add()
   {
	   Instance i=new Instance();
	   System.out.println(i.x);
	   System.out.println(i.y);
	   
   }
      public static void main(String args[]) {
     Instance.add();
   }
}
