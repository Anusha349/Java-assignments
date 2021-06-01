import java.util.Arrays;
public class TwoSpecific {
   public static void main(String args[]){
      int[] a= {24,23,44,12,54,64,74};
      int num1= 12;
      int num2=23;

      for(int i= 0; i<a.length;i++){
         if(num1 == a[i])
         {
            System.out.println("Array contains"+num1);
         }
         else if(num2==a[i])
         {System.out.println("Array contains"+num2);
         }
}
}
}
