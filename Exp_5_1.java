class Student
{
	int st_id;
	String name;
	static int id = 0;
	
	Student(String name)
	{
		this.st_id = id+1;
		this.name = name;
		id++;
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+st_id);
		System.out.println();
	}
}

class Exp_5_1
{
	public static void main(String args[])
	{
		Student s[] = new Student[3];
		s[0] = new Student("Harsha");
		s[1] = new Student("Tyson");
		s[2] = new Student("Gamer");
		s[0].display();
		s[1].display();
		s[2].display();
	}
}
	