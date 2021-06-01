import java.util.Scanner;
 class Emp{
	private int eid;
	private String ename;
	private float basic;
	 private void getemp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter empid");
		eid=sc.nextInt();
		System.out.println("enter ename");
		ename=sc.nextLine();
		System.out.println("enter basic salary");
		basic=sc.nextFloat();
	}
	private void putemp()
	{
		System.out.println("empid:"+eid+" ");
		System.out.println("empname:"+ename+" ");
		System.out.println("empsalary:"+basic+" ");
	}
 }
	class Emp1 extends Emp{
		private int a=101;
		private void get()
		{
			System.out.println(a);
		
	}
	  class TestEmp{
	public static void main(String[] args) {
   Emp1 e1=new Emp1();
   e1.get();
	}
}
	}