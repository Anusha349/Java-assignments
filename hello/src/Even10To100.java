import java.util.Scanner;
public class Even10To100 {

	public static void main(String[] args) {
		int i=10,n=100;
		System.out.print("even numbers from 10 to "+n+" are:");
		while(i<=n)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		    i++;
		}
	
	}
}