public interface Ab{
	public int a=15;
	public String s="interfaces";
	public void show();
}
 public class Bc implements Ab{
	public void show()
	{
		System.out.println(a);
		System.out.println(s);
	}
}
public class Main5 {
	public static void main(String args[]) {
		Bc i=new Bc();
		i.show();
	}
}
