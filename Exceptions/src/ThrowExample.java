public class ThrowExample {
   static void checkEligibilty(int stuage, int stuweight)
   { 
      if(stuage>12 && stuweight>40) 
      {
         throw new ArithmeticException("Student is not eligible for registration"); 
      }
      else {
         System.out.println("Student Entry is Valid!!"); 
      }
   } 

   public static void main(String args[])
   { 
     checkEligibilty(13, 41); 
     System.out.println("welcome to registration process");
     System.out.println("Have a nice day.."); 
 } 
}