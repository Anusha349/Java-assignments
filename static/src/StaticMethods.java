import java.io.*;
public class StaticMethods {
	static String m="static";
	static String n="methods";
	static void getmethods()
	{
		System.out.println(m+" "+n);
	}
   void setmethods()
   {
	   StaticMethods.getmethods();
   }
	public static void main(String[] args) {
	StaticMethods sm=new StaticMethods();
	sm.setmethods();
	}
}
