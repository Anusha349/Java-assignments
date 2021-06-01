import java.io.*;
class B1 {
	void dis()
	{
		int a=10;
		int b=15;
		System.out.println(a+b);
	}
	void msg(int a) {
		System.out.println(a);
	}
}
 class A2{
	public static void main(String args[]) {
		B1 obj=new B1();
		obj.dis();
		obj.msg(7);
	}
 }