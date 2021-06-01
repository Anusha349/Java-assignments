class Overloading{
	void addition(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void addition(String s,String m)
	{
		System.out.println(s+" "+m);
	}
}
 class Sample2 {
	 public static void main(String args[]) {
		 Overloading ol=new Overloading();
		 ol.addition("method", "overloading");
		 ol.addition(5, 6, 7);
	 }
}
