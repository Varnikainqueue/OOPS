/*
class Student {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("abc");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
*/


/*
class BankAccount {
    private double balance;

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }
}
class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setBalance(15000);

        System.out.println("Balance: " + account.getBalance());
    }
}
*/


/*
class Employee {
    private int id;
    private String name;

    public void setId(int i) {
        id = i;
    }

    public void setName(String n) {
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
class Encapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setId(101);
        e.setName("ABC");

        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
    }
}
*/


class Car {
    private String model;
    private String color;

    public void setModel(String m) {
        model = m;
    }

    public void setColor(String c) {
        color = c;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}

class Encapsulation {
    public static void main(String[] args) {
        Car c = new Car();

        c.setModel("Swift");
        c.setColor("White");

        System.out.println("Model: " + c.getModel());
        System.out.println("Color: " + c.getColor());
    }
}



