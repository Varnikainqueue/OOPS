abstract class Patient {
    private double bill;

    public void setBill(double bill) {
        this.bill = bill;
    }

    public double getBill() {
        return bill;
    }

    
    abstract void calculateBill();
}

class IndoorPatient extends Patient {

    int days = 5;
    double roomCharge = 2000;
    double treatmentCharge = 5000;

    void calculateBill() {
        double total = (days * roomCharge) + treatmentCharge;
        setBill(total);

        System.out.println("Indoor Patient Bill = Rs. " + getBill());
    }
}

class OutdoorPatient extends Patient {

    double consultationFee = 800;
    double medicineCharge = 1200;

    void calculateBill() {
        double total = consultationFee + medicineCharge;
        setBill(total);

        System.out.println("Outdoor Patient Bill = Rs. " + getBill());
    }
}

public class Main5{

    public static void main(String[] args) {

        Patient p1 = new IndoorPatient();
        Patient p2 = new OutdoorPatient();

        p1.calculateBill();
        p2.calculateBill();
    }
}