import java.util.Scanner;
public class Logical {

	public static void main(String[] args) {
	 int a,b,c;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter three numbers");
	 a=sc.nextInt();
	 b=sc.nextInt();
	 c=sc.nextInt();
	 System.out.println(a>b && a>c);
	 System.out.println(a>c || b<c);
	 System.out.println(a!=b);
	}
}
