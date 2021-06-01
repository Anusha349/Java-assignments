class Constructor{
	Constructor()
	{
		System.out.println("calling constructor using this");
	}
	Constructor(int x)
	{
		this();
		System.out.println("x value="+x);
	}
}
 class Demo2 {
	 public static void main(String args[]) {
		 Constructor c1=new Constructor(15);
	 }
}
