import java.util.Scanner;
class Vehicle{
    int model;
    String brand;

    void inputVehicle(){
        Scanner scn = new Scanner(System.in);
        model = scn.nextInt();
        brand = scn.nextLine();
    }

    void displayVehichle(){
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle{
    String fuel_type;
    int capacity;

    void inputCar(){
        Scanner scn = new Scanner(System.in);
        capacity = scn.nextInt();
        fuel_type = scn.nextLine();
    }

    void displayCar(){
        displayVehichle();
        System.out.println("Capacity: " + capacity);
        System.out.println("Fuel Type: " + fuel_type);
    }
}

public class Main7 {
    public static void main(String[] args){
        Car c = new Car();

        c.inputVehicle();
        c.inputCar();

        c.displayCar();
        

    }
    
}
