import java.io.*;  
public class A1{  
	public int a=10;
public void msg(){System.out.println(+a);
}  
public void display(int b) {
	System.out.println(b);
}
}  
class B{  
  public static void main(String args[]){  
   A1 obj = new A1();  
   obj.msg();
   obj.display(5);
  }  
}  