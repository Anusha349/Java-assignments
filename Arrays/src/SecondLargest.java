import java.util.Arrays;
public class SecondLargest{  
public static int getSecondLargest(int[] a, int total){  
int n;
for (int i=0;i<total;i++)   
        {  
            for (int j=i+1;j<total;j++)   
            {  
                if (a[i] > a[j])   
                {  
                    n= a[i];  
                    a[i] = a[j];  
                    a[j]=n;  
                }  
            }  
        }  
       return a[total-2];  
}  
public static void main(String args[]){  
int a[]={1,5,7,8,12,18};    
System.out.println("Second Largest: "+getSecondLargest(a,6));   
}
}  