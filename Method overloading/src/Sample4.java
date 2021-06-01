class Method
{  
  static void add(int m, int n,int o)
  {
	  System.out.println(m+n+o);
  }  
  static void add(double a, double b,double c)
  {
	  System.out.println(a+b+c);
  }  
}  
class Sample4{  
    public static void main(String[] args){  
    Method.add(2,6,10);
    Method.add(15.4,12.5,14.5); 
  }
}  
