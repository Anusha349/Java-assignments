class Drink{  
Drink(){
	System.out.println("class drink is created");
}  
}  
class Tea extends Drink{  
Tea(){  
super();  
System.out.println("here is your tea");  
}  
}  
class Test4{  
public static void main(String args[]){  
Tea d=new Tea();  
}
}