abstract class SmartDevice {

    abstract void turnOn();
    abstract void turnOff();
}

class Laptop extends SmartDevice {

    void turnOn() {
        System.out.println("Laptop is turning ON");
    }

    void turnOff() {
        System.out.println("Laptop is turning OFF");
    }
}

class Smartphone extends SmartDevice {

    void turnOn() {
        System.out.println("Smartphone is turning ON");
    }

    void turnOff() {
        System.out.println("Smartphone is turning OFF");
    }
}

class SmartWatch extends SmartDevice {

    void turnOn() {
        System.out.println("SmartWatch is turning ON");
    }

    void turnOff() {
        System.out.println("SmartWatch is turning OFF");
    }
}

public class Main {
    public static void main(String[] args) {

        SmartDevice devices[] = {
                new Laptop(),
                new Smartphone(),
                new SmartWatch()
        };

        for (SmartDevice d : devices) {
            d.turnOn();
            d.turnOff();
            System.out.println();
        }
    }
}