
 class A {
	void display(int a,int b)
	{
		System.out.println("sum="+(a+b));
	}
	void set(int b)
	{
		System.out.println(b);
	}
	void dis(int e)
	{
		System.out.println(e);
	}
}
class B extends A{
	void show(int x,int y)
	{
		System.out.println("diff="+(x-y));
	}
	void show1(int x)
	{
		System.out.println(x);
	}
	void dis(int e)
	{
		System.out.println(e);
	}
}
class C extends B{
	void get(int c,int d)
	{
		System.out.println("mul="+(c*d));
	}
	void get1(int c)
	{
		System.out.println(c);
	}
	void dis(int e)
	{
		System.out.println(e);
	}
}
class Main
{
	public static void main(String[] args)
	{
	 C obj=new C();
	obj.display(3,4);
	obj.set(5);
	obj.dis(7);
	obj.show(5,3);
	obj.show1(8);
	obj.get(8, 9);
	obj.get1(7);
	obj.dis(7);
	obj.dis(7);
	}
}
