class Subtracter
{  
   int sub1(int a,int b,int c)
  {
	 return a-b-c;
	 }  
   int sub1(int d,int e,int f)
   {
	 return d-e-f;
	 }  
}  
class Sample3{  
     public static void main(String[] args){
     Subtracter s=new Subtracter();
     System.out.println(s.sub1(9,4,5));
     System.out.println(s.sub1(10,1,6));
}
}
