class Student10{  
   int n;  
   String s;  
   float f;  
Student10(int n,String s,float f)
{  
   this.n=n;  
   this.s=s;  
   this.f=f;  
}  
void display()
{
      System.out.println(n);
      System.out.println(s);
      System.out.println(f);
}  
}  
class Program
{  
     public static void main(String args[]){  
     Student10 s1=new Student10(111,"anusha",5000f); 
     s1.display(); 
}
}    