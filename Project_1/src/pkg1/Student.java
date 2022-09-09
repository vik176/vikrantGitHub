package pkg1;

public class Student {
	
	
	int age; int rollno;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		
		Student std = new Student();
		std.age=30;
		std.rollno=1234;
		System.out.println(std.age);
		System.out.println(std.rollno);
		std.display1();
		std.display2();
	}

}
