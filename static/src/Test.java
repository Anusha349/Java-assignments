import java.io.*;
public class TwoMethods{
	static int a=10;
	static int b=20;
	String m="hello";
	String n="world";
	static void add()
	{
		System.out.println(a+b);
	}
	static void sub()
	{
		System.out.println(a-b);
	}
	void display()
	{
		System.out.println(m);
	}
	void set()
	{
		System.out.println(n);
	}
}
	public class Test{	
	public static void main(String[] args) {
	TwoMethods tm=new TwoMethods();
	tm.add();
	tm.sub();
	tm.display();
	tm.set();
	}
}
