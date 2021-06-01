public class Employee2 {
    public String firstName;
    private int a;
    protected float n;
    char b;
 
    public Employee2() {
    	String firstName="anusha";
    }
    	public void show() {
    		System.out.println("anusha");
    	}
    private Employee2(int a) {
    	a=1045;
    }
    private void get() {
    	System.out.println(1045);
    }
    protected Employee2(float n,char b) {
    	n=10000f;
    	b='a';
    }
    protected void dis() {
    	System.out.println('a');
    	System.out.println(10000f);
    }
    Employee2(char a){
    	a='b';
    }
    void display() {
    	System.out.println('b');
    }
 public static void main(String[] args) {
	 Employee2 e2=new Employee2();
	 e2.show();
	 e2.get();
	 e2.dis();
	 e2.display(); 
    }
}
