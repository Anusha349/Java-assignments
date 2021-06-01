interface A{
	void show();
}
interface B{
	void dis();
}
class C implements A,B{
	public void show() {
		System.out.println("show A");
	}
	public void dis() {
		System.out.println("show B");
	}
}
public class Main {
	public static void main(String args[]) {
		C obj=new C();
		obj.show();
		obj.dis();
	}
}
