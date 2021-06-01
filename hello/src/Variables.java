import java.util.Scanner;
public class Variables {
	int t=12;
	public static void main(String[] args) {
	Variables v=new Variables();
	v.test();
	}
	public void test() {
		int t=4;
		System.out.println("local t="+t);
		System.out.println("global t="+this.t);
}
}