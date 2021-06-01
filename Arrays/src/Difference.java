import java.util.Arrays; 
 public class Difference {
 public static void main(String[] args)
 {
    int[] a = {5,7,13,25,4,6,9};
	System.out.println("Original Array: "+Arrays.toString(a)); 
	int max=a[0];
	int min=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max)
			max=a[i];
		else if(a[i]<min)
			min=a[i];
	}
	System.out.println("Difference between the largest and smallest values of the given array: "+(max-min));	
 }
}
