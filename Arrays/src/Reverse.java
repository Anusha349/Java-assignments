import java.util.Arrays; 
public class Reverse {
public static void main(String[] args){   
    int[] b= {3,7,9,10,2,16,18,20};
  System.out.println("Original array : "+Arrays.toString(b));  
   for(int i=0;i<b.length/2;i++)
  {
    int n= b[i];
    b[i] = b[b.length - i - 1];
    b[b.length-i-1] =n;
  }
    System.out.println("Reverse array : "+Arrays.toString(b));
 }
}
