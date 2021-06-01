import java.io.*;
abstract class Shape{  
abstract void draw(); 
}  
abstract class Rectangle extends Shape{  
void draw()
{
	System.out.println("drawing rectangle");
	}   
abstract void dis();
}
class Circle1 extends Rectangle
{  
void dis()
{
	System.out.println("drawing circle");
	}   
public static void main(String args[]){  
Circle1 s=new Circle1();
s.draw();
s.dis();
}  
}  

