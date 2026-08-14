class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    void displayStudent() {
        System.out.println("Student Details:");
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Roll No = " + rollNo);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayTeacher() {
        System.out.println("Teacher Details:");
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Subject = " + subject);
    }
}

class Exp_3_8 {
    public static void main(String args[]) {
        Student s1 = new Student("Wukong", 20, 101);
        Teacher t1 = new Teacher("Trevor", 40, "CyberSecurity");

        s1.displayStudent();
        System.out.println();

        t1.displayTeacher();
    }
}
