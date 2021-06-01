import java.io.*;
public class Variables {
static int a=20;
int b=30;
	public static void main(String[] args) {
		System.out.println("Static variable:"+a);
		Variables v=new Variables();
		System.out.println("Instance variable:"+v.b);
		}
	}
