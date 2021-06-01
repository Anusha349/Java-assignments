interface F1{
	void i1();
	void i2();
}
class F2 implements F1{
	public void i1()
	{
		System.out.println("I1");
	}
}
class F {
	public static void main(String args[]) {
		F2 f=new F2();
		f.i1();
	}
}
