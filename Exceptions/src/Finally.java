public class Finally {
public static void main(String args[])
{
	try
	{
		System.out.println("try block");
		System.out.println(10/0);
	}
	catch(ArithmeticException e)
	{
		System.out.println("catch block");
	}
	finally
	{
		System.out.println("finally block");
	}
}
}
