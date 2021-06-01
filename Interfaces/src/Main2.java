interface Inf1{
	void show();
}
interface Inf2{
	void show();
}
class Inf3 implements Inf1,Inf2{
	public void show()
	{   int a=10;
		System.out.println(a);
	}
	public void show()
	{
		int a=10,b=15;
		System.out.println(a+b);
	}
}
public class Main2 {
	public static void main(String args[]) {
		Inf3 f3=new Inf3();
		f3.show();
		f3.show();
	}
}
