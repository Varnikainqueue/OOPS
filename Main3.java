class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

    void displayRole() {
        System.out.println("Person : " + name);
    }
}

class Student extends Person {

    Student(String name) {
        super(name);
    }

    void displayRole() {
        System.out.println(name + " is a Student");
    }
}

class ResearchStudent extends Student {

    ResearchStudent(String name) {
        super(name);
    }

    void displayRole() {
        System.out.println(name + " is a Research Student");
    }
}

class PhDStudent extends ResearchStudent {

    PhDStudent(String name) {
        super(name);
    }

    void displayRole() {
        System.out.println(name + " is a PhD Student");
    }
}

public class Main3{
    public static void main(String[] args) {

        Person p1 = new Student("Rahul");
        Person p2 = new ResearchStudent("Anjali");
        Person p3 = new PhDStudent("Aman");

        p1.displayRole();
        p2.displayRole();
        p3.displayRole();
    }
}