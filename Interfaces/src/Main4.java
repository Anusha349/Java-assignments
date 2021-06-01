interface Instance{
	void show();
	void dis();
}
class Variable implements Instance{
	public void show() {
		System.out.println("display show method");
	}
	public void dis() {
		System.out.println("display dis method");
	}
}
class Main4{
	public static void main(String args[]) {
		Instance i=new Variable();
		i.show();
		i.dis();
	}
}