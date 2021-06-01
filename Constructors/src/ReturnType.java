import java.io.*;
public class ReturnType {
	int i;
	String s;
	public ReturnType(int i){
		i=1;
	}
	 public void set() {
	System.out.println(1);
	return;
	 }
	 public ReturnType(String s) {
		 s="returntype";
	 }
	 public void get() {
		 System.out.println("returntype");
		 return;
	 }
	 public static void  main(String args[]) {
		 ReturnType rp=new ReturnType(1);
		 rp.set();
		 rp.get();
	 }
}