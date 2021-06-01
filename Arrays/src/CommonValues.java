import java.util.Arrays; 
public class CommonValues {
public static void main(String[] args) 
    {
      int[] arr1 = {1,11, 2,4, 5, 5, 8, 9, 7, 10};
      int[] arr2 = {1, 0, 6, 15, 6, 4, 7,11,0};
 
       System.out.println("arr1:"+Arrays.toString(arr1));
       System.out.println("arr2:"+Arrays.toString(arr2));
 
      
        for (int i=0;i< arr1.length;i++)
        {
            for (int  j= 0;j<arr2.length;j++)
            {
                if(arr1[i]==(arr2[j]))
                {
                 
                 System.out.println("Common element is : "+(arr1[i]));
                 }
            }
        }
 
    }
}
