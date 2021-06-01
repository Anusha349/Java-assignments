import java.io.*;
 class Parent {
	int i,j;
	Parent(int i,int j) {
		this.i=i;
		this.j=j;
	}
	void display()
	{
		System.out.println("i value="+i);
		System.out.println("j value="+j);
	}
	}
class Child extends Parent
{  int k;
  Child(int a,int b,int c)
  {
	  super(a,b);
	  k=c;
  }
	void sum()
	{
		System.out.println("sum="+(i+j+k));
	}
}
	class Demo{
		public static void main(String args[]) {
			Child d=new Child(5,6,8);
			d.display();
		}
}
