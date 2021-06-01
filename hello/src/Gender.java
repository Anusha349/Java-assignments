import java.util.Scanner;
public class Gender {

	public static void main(String[] args) {
		String gender;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter gender(Male or Female):");
		gender=sc.nextLine();
	switch(gender)
	{case "male":System.out.println(" gender is male");break;
	 case "Female":System.out.println(" gender is female");break;
	}
	}
}
