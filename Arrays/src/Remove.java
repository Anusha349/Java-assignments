import java.util.Arrays; 
public class Remove {
 
public static void main(String[] args) {
   int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   
   System.out.println("Original Array : "+Arrays.toString(a));     
   int removeIndex = 3;

   for(int i = removeIndex; i < a.length-1; i++){
        a[i] = a[i+1];
      }
    System.out.println("After removing the specific element: "+Arrays.toString(a));
 }
 }
