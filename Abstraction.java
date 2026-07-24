/*
abstract class Vehicle{
    abstract void car();
    abstract void plane();
    void ship(){
        System.out.println("Water Transportation");
    }
}
class People extends Vehicle{
    void car(){
        System.out.println("Land Transportation!");
    }
    void plane(){
        System.out.println("Air Transportation!");
    }
}
class Abstraction{
    public static void main(String[] ags){
        People p = new People();
        p.car();
        p.ship();
        p.plane();
    }
}
*/


/*
abstract class Animal{
    abstract void owl();

    abstract void whale();
}
class People extends Animal{
    void owl(){
        System.out.println("Owl wakes up at night!");
    }
    void whale(){
        System.out.println("Whale is water animal!");

    }
}
class Abstraction{
    public static void main(String[] args){
        People p = new People();
        p.owl();
        p.whale();

    }
}
*/

/*
abstract class Employee {
    abstract void calculateSalary();
}
class FullTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Salary = Rs. 50,000");
    }
}
class PartTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Salary = Rs. 20,000");
    }
}
class  Abstraction{
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        e1.calculateSalary();
        e2.calculateSalary();
    }
}
*/

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Abstraction {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();
        s2.draw();
    }
}

