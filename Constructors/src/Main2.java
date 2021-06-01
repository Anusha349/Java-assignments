class Student3{  
int id=113;  
String n="anusha";
void display()
{
	System.out.println(+id);
	System.out.println(n);
}     
    Student3(String s){  
    s= "anu";
    }    
	void dis()
    {
    	System.out.println("anu");
    	}  
	Student3(int a,String s){
		a=110;
		s="cheripally";
	}
	void show()
	{
		System.out.println(110);
		System.out.println("cheripally");
	}
}
class Main2{
public static void main(String args[]) { 
Student3 s2=new Student3(110,"cheripally");
s2.display(); 
s2.dis();
s2.show();
}  
}  