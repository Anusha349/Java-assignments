interface Sayable{  
    default void say() {  
        saySomething();  
    }   
    void saySomething() {  
        System.out.println("Hello... I'm private method");  
    }  
}  
public abstract class PrivateInterface implements Sayable {  
	public void say() {
		System.out.println("default method");
	}
}
class Main7{
    public static void main(String[] args) {  
        Sayable s = new PrivateInterface();  
        s.say();  
        s.saySomething();
    }  
}  