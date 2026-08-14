class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int empId;
    double salary;

    Employee(int empId, double salary, String name, int age) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }
}

class Exp_3_7 {
    public static void main(String args[]) {
        Employee e1 = new Employee(101, 125000, "Wukong", 27);

        System.out.println("Details: ");
        System.out.println("Emp Id = " + e1.empId);
        System.out.println("Emp Salary = " + e1.salary);
        System.out.println("Emp Name = " + e1.name);
        System.out.println("Emp Age = " + e1.age);
    }
}
