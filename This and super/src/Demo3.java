class Constructor2
{
	public Constructor2(String s)
	{
		s="one argument constructor";
		System.out.println(s);
	}
	public Constructor2(String n,String m)
	{
		this(n);
		System.out.println("String concatination="+(n+" "+m));
	}
}
public class Demo3 {
	public static void main(String args[]) {
		Constructor2 c2=new Constructor2("constructor calling","using this");
	}
}
