import java.io.*;
class Animal{
	void move()
	{
		System.out.println("Animal move");
	}
	class Dog extends Animal{
		
		void bark()
		{
			System.out.println("dog bark");
		}
	}
		 class Cat extends Dog{
			void meow()
			{
				System.out.println("cat moves");
			}
		 }
	public static void main(String args[]) {
		Animal d=new Animal();
		d.move();
	}
}
