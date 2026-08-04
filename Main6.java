import java.util.Scanner;
class Person {
    String name;
    int age;

    void inputPerson() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;
    int marks;

    void inputStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class Main6{
    public static void main(String[] args) {

        Student s = new Student();

        s.inputPerson();
        s.inputStudent();
        
        s.displayStudent();
    }
}





























