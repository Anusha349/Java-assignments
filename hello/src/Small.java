import java.util.Scanner;
public class Small {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a<b && a<c)
		System.out.println("smaller number is:"+a);
		else if(b<a && b<c)
		System.out.println("smaller number is:"+b);
		else
		System.out.println("smaller number is:"+c);
		if(a>b && a>c)
	    System.out.println("larger number is:"+a);
		else if(b>a && b>c)
		System.out.println("larger number is:"+b);
		else
        System.out.println("larger number is:"+c);
	}
}
