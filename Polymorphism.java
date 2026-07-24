/*
class Addition {

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum = " + (a + b));
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Addition obj = new Addition();

        obj.add(10, 20);
        obj.add(5.5, 4.5);
    }
}
*/



/*
class Print {

    void display(String name) {
        System.out.println(name);
    }

    void display(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Print p = new Print();

        p.display("abc");
        p.display("abc", 19);
    }
}
*/



/*
class Bird {

    void fly() {
        System.out.println("Bird can fly");
    }
}

class Sparrow extends Bird {

    @Override
    void fly() {
        System.out.println("Sparrow flies fast");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Sparrow s = new Sparrow();
        s.fly();
    }
}
*/



/*
class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Vehicle v = new Car();
        v.start();
    }
}
*/




class Employee {

    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {

    @Override
    void work() {
        System.out.println("Manager manages team");
    }
}

class Developer extends Employee {

    @Override
    void work() {
        System.out.println("Developer writes code");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Employee e;

        e = new Manager();
        e.work();

        e = new Developer();
        e.work();
    }
}