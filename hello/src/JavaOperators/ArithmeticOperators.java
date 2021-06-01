package JavaOperators;
import java.io.*;
public class ArithmeticOperators {
      static void addition(int num1, int num2){
            System.out.print("Addition of given numbers = ");
            System.out.println(num1 + num2);
      }     
      static void subtraction(int num1, int num2){
            System.out.print("Subtraction of given numbers = ");
            System.out.println(num1 - num2);
      }     
      static void multiplication(int num1, int num2){
            System.out.print("Multiplication of given no.s = ");
            System.out.println(num1 * num2);
      }     
      static void division(int num1, int num2){
            System.out.print("Division of given given no.s = ");
            System.out.println(num1 / num2);
      }     
      public static void main(String args[]){
            addition(10,15);
            subtraction(15,13);
            multiplication(5,7);
            division(5,8);
      }
}