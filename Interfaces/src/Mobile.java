interface Features{
	void dailing();
}
class SmartPhone implements Features{
public void dailing() {
	System.out.println("smart phone is dailing");
}
}
public class Mobile {
	public static void main(String args[]) {
	SmartPhone sp=new SmartPhone();
	sp.dailing();
	}
}
