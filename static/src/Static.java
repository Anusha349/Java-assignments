import java.io.*;
public class Static {
	static int a=2;
	static int b=3;
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
	Static s=new Static();
	s.display();
	}
}
