abstract class Transport {

    abstract void fare();

    abstract void travelTime();
}

class Bus extends Transport {

    void fare() {
        System.out.println("Bus Fare = Rs.100");
    }

    void travelTime() {
        System.out.println("Travel Time = 5 Hours");
    }
}

class Train extends Transport {

    void fare() {
        System.out.println("Train Fare = Rs.350");
    }

    void travelTime() {
        System.out.println("Travel Time = 3 Hours");
    }
}

class Flight extends Transport {

    void fare() {
        System.out.println("Flight Fare = Rs.5000");
    }

    void travelTime() {
        System.out.println("Travel Time = 1 Hour");
    }
}

public class Main4{
    public static void main(String[] args) {

        Transport arr[] = {
                new Bus(),
                new Train(),
                new Flight()
        };

        for (Transport t : arr) {
            t.fare();
            t.travelTime();
            System.out.println();
        }
    }
}