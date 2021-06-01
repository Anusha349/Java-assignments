import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
	int n,r,m,rev=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	n=sc.nextInt();
	m=n;
    while(n>0) {
    	r=n%10;
    	rev=rev*10+r;
    	n=n/10;
    }
    if(rev==m)
    	System.out.println("palindrome number");
    else
    	System.out.println("not palindrome number");
	}
}
