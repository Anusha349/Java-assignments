import java.util.Arrays; 
public class Insert {
 
public static void main(String[] args) {

   int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   
   int Index_position = 2;
   int newValue = 5;

  System.out.println("Original Array : "+Arrays.toString(a));     
   
  for(int i=a.length-1; i > Index_position; i--){
    a[i] = a[i-1];
   }
   a[Index_position] = newValue;
   System.out.println("New Array: "+Arrays.toString(a));
 }
 }