class Employee {

    void calculateBonus() {
        System.out.println("Employee Bonus = 5000");
    }
}

class Manager extends Employee {

    void calculateBonus() {
        System.out.println("Manager Bonus = 15000");
    }
}

class Developer extends Employee {

    void calculateBonus() {
        System.out.println("Developer Bonus = 10000");
    }
}

class Tester extends Employee {

    void calculateBonus() {
        System.out.println("Tester Bonus = 8000");
    }
}

public class Main1{

    public static void main(String[] args) {

        Employee emp[] = {
                new Manager(),
                new Developer(),
                new Tester()
        };

        for (Employee e : emp) {
            e.calculateBonus();
        }
    }
}