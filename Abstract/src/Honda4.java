import java.io.*;
abstract class Bike{
   abstract void run();
   void ride() 
   {
	   System.out.println("bike riding");
   }
 }

 class Honda4 extends Bike{
 void run(){
	 System.out.println("running safely..");
 }
 public static void main(String args[]){
  Honda4 obj = new Honda4();
  obj.run();
  obj.ride();
 }
 }
