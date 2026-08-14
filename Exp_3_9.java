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

    Employee(String name, int age, int empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int age, int empId, double salary, String department) {
        super(name, age, empId, salary);
        this.department = department;
    }

    void display() {
        System.out.println("Manager Details:");
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Employee Id = " + empId);
        System.out.println("Salary = " + salary);
        System.out.println("Department = " + department);
    }
}

class Exp_3_9 {
    public static void main(String args[]) {
        Manager m1 = new Manager("Wukong", 27, 101, 125000, "IT");

        m1.display();
    }
}
