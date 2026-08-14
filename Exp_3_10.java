class Employee
{
    double grossSal, deductions, netSal;

    Employee(double grossSal, double deductions)
    {
        this.grossSal = grossSal;
        this.deductions = deductions;
    }

    void display()
    {
        calcNetSalary();
        System.out.println("Net Salary = " + netSal + "\n");
    }

    void calcNetSalary()
    {
        netSal = (1 - deductions) * grossSal;
    }
}

class Programmer extends Employee
{
    Programmer(double grossSal, double deductions)
    {
        super(grossSal, deductions);
    }
}

class AssistantProfessor extends Employee
{
    AssistantProfessor(double grossSal, double deductions)
    {
        super(grossSal, deductions);
    }
}

class AssociateProfessor extends Employee
{
    AssociateProfessor(double grossSal, double deductions)
    {
        super(grossSal, deductions);
    }
}

class Professor extends Employee
{
    Professor(double grossSal, double deductions)
    {
        super(grossSal, deductions);
    }
}

class Exp_4_1
{
	public static void main(String args[])
	{
		Employee pg1 = new Programmer(60000.00,0.10);
		Employee ap1 = new AssistantProfessor(70000.00,0.15);
		Employee ap2 = new AssociateProfessor(65000.00,0.13);
		Employee p1 = new Professor(75000.00,0.20);
		pg1.display();
		ap1.display();
		ap2.display();
		p1.display();
	}
}
