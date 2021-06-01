class Person
{
    void message()
    {
        System.out.println("This is person class");
    }
    void dis()
    {
    	System.out.println("this is a person class with method");
    	this.message();
    }
}
class Student extends Person
{
    void show()
    {
        System.out.println("This is student class");
    }
    void display()
    {
    	show();
        super.message();
    }
}
class Test5
{
    public static void main(String args[])
    {
        Student s = new Student();
        s.display();
        s.dis();
    }
}
