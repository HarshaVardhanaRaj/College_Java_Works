import java.util.*;
class Student
{
	private int rollno;
	private String name;
	static String collname = "LICET";
	
	Student(int rollno, String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll.no: "+rollno);
		System.out.println("College: "+collname);
		System.out.println();
	}
}

class Exp_5_2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("How many Students?: ");
		int n = in.nextInt();
		Student s[] = new Student[n];
		String name;
		System.out.println("Enter Names of "+n+" Students: ");
		
		for(int i=0 ; i<n ; i++)
		{
			System.out.print("Enter Name of Student "+(i+1)+": ");
			name = in.next();
			s[i] = new Student(i+1, name);
		}
		
		System.out.println();
		
		for(int i=0 ; i<n ; i++)
		{
			s[i].display();
		}
	}
}
	
