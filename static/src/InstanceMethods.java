import java.io.*;
public class InstanceMethods {
	void get(int a,int b)
	{
		System.out.println(a+b);
	}
	static void set()
	{
		InstanceMethods im=new InstanceMethods();
		im.get(5, 6);
	}
	public static void main(String[] args) {
	set();
	}
}
