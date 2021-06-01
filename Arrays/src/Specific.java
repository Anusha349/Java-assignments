import java.io.*;
public class Specific {
   public static void main(String args[]){
      int[] a= {24,34,44,54,64,74};
      int num= 64;

      for(int i= 0; i<a.length;i++){
         if(num == a[i]){
            System.out.println("Array contains the specific value");
         }
      }
}
}
