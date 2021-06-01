import java.io.*;
public class MainMethod {
	static void value(String a,String b)
	{
		System.out.println(a+b);
	}
   void get(int b)
   {
	   System.out.println(b);
   }
	public static void main(String[] args) {
	MainMethod.value("instance","methods");
	MainMethod mm=new MainMethod();
	mm.get(5);
	}
}
