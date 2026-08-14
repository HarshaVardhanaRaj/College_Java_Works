class Employee {
    String name;
    int empId;
    double basicSalary;

    Employee(String name, int empId, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    void generatePayslip(String designation) {
        double da = basicSalary * 0.10;
        double hra = basicSalary * 0.20;
        double pf = basicSalary * 0.12;

        double grossSalary = basicSalary + da + hra;
        double netSalary = grossSalary - pf;

        System.out.println("\n----- PAYSLIP -----");
        System.out.println("Employee ID  = " + empId);
        System.out.println("Name         = " + name);
        System.out.println("Designation  = " + designation);
        System.out.println("Basic Salary = " + basicSalary);
        System.out.println("DA           = " + da);
        System.out.println("HRA          = " + hra);
        System.out.println("Gross Salary = " + grossSalary);
        System.out.println("PF           = " + pf);
        System.out.println("Net Salary   = " + netSalary);
    }
}

class Programmer extends Employee {
    Programmer(String name, int empId, double basicSalary) {
        super(name, empId, basicSalary);
    }

    void display() {
        generatePayslip("Programmer");
    }
}

class AssistantProfessor extends Employee {
    AssistantProfessor(String name, int empId, double basicSalary) {
        super(name, empId, basicSalary);
    }

    void display() {
        generatePayslip("Assistant Professor");
    }
}

class AssociateProfessor extends Employee {
    AssociateProfessor(String name, int empId, double basicSalary) {
        super(name, empId, basicSalary);
    }

    void display() {
        generatePayslip("Associate Professor");
    }
}

class Professor extends Employee {
    Professor(String name, int empId, double basicSalary) {
        super(name, empId, basicSalary);
    }

    void display() {
        generatePayslip("Professor");
    }
}

class Exp_3_10 {
    public static void main(String args[]) {

        Programmer p = new Programmer("Wukong", 101, 50000);
        AssistantProfessor ap = new AssistantProfessor("Ravi", 102, 60000);
        AssociateProfessor aop = new AssociateProfessor("Kumar", 103, 70000);
        Professor prof = new Professor("Raj", 104, 80000);

        p.display();
        ap.display();
        aop.display();
        prof.display();
    }
}
