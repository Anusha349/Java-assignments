
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
	int n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	n=sc.nextInt();
	for(i=2;i<=n/2;i++)
	{if(n%i==0)
	{
		System.out.println("not a prime number");
		System.exit(0);
	}
	}
	System.out.println("prime number");
	}

}
