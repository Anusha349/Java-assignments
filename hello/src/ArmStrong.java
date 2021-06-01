import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
	int n,r,sum=0,m;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	n=sc.nextInt();
	m=n;
    while(n>0) {
    	r=n%10;
    	sum=sum+(r*r*r);
    	n=n/10;
    }
    if(sum==m)
    	System.out.println("Armstrong number");
    else
    	System.out.println("not Armstrong number");
	}
}
