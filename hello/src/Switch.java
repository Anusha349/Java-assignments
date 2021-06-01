import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	n=sc.nextInt();
  switch(n%2)
  {
  case 0:System.out.println(n+"is an even number");
           break;
  case 1:System.out.println(n+"is an odd number");
        break;
  }
	}
}
