class Adder
{  
   int add(int a,int b)
  {
	 return a+b;
	 }  
   int add(int a,int b,int c)
   {
	 return a+b+c;
	 }  
}  
class Sample{  
     public static void main(String[] args){
     Adder a=new Adder();
     System.out.println(a.add(6, 7));
     System.out.println(a.add(6,7,8));
}
}