class Employee{  
int id=1045; 
String n="anusha";
Float s=100000f;
void display()
{
	System.out.println(+id);
	System.out.println(n);
	System.out.println(s);
}     
    Employee(String n,Float s){ 
    	n="anu";
    	s=10000f;
    }
	void dis()
    {
    	System.out.println("anu");
    	System.out.println(10000f);
    	}  
}
class Emp extends Employee{
	public static void main(String args[]) {
		Employee e1=new Employee("anu",10000f);
		e1.display();
		e1.dis();
	}
}