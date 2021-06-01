package JavaOperators;
import java.util.Scanner;
public class Equal {
	public static void main(String[] args) {
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	if(a==b)
	System.out.println("given two numbers are equal");
	else
    System.out.println("given two numbers are not equal");
	}
}
