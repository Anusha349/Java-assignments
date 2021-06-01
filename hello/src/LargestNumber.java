import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter three numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a>b && a>c)
	System.out.println(a+ " is largest number");
	else if(b>c)
	System.out.println(b+ "is largest number");
	else
	System.out.println(c+ "is largest number");
	}
}
