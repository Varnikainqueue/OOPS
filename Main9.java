class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void showDetails() {
        System.out.println("Name: " + name);
    }
}

class Doctor extends Person {
    String specialization;

    Doctor(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }

    
    void showDetails() {
        super.showDetails();   
        System.out.println("Specialization: " + specialization);
    }
}

public class Main9 {
    public static void main(String[] args) {

        Doctor d = new Doctor("AbC", "Cardiologist");

        d.showDetails();
    }
}































