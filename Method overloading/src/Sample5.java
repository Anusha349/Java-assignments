class ReturnType
{
    double myMethod(int num1, int num2)
   { 
       return num1+num2;
   }
    int myMethod(int var1, int var2)
   {
       return var1-var2;
   }
}
class Sample5
{
   public static void main(String args[])
   {
       ReturnType rp= new ReturnType();
       System.out.println(rp.myMethod(10,10));
       System.out.println(rp.myMethod(20,12));
   }
}