abstract class Product {

    private double price;

    Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    abstract double discount();
}

class Electronics extends Product {

    Electronics(double price) {
        super(price);
    }

    double discount() {
        return getPrice() * 0.90;
    }
}

class Clothing extends Product {

    Clothing(double price) {
        super(price);
    }

    double discount() {
        return getPrice() * 0.80;
    }
}

class Grocery extends Product {

    Grocery(double price) {
        super(price);
    }

    double discount() {
        return getPrice() * 0.95;
    }
}

public class Main2{
    public static void main(String[] args) {

        Product p1 = new Electronics(50000);
        Product p2 = new Clothing(2000);
        Product p3 = new Grocery(1000);

        System.out.println("Electronics Price = " + p1.discount());
        System.out.println("Clothing Price = " + p2.discount());
        System.out.println("Grocery Price = " + p3.discount());
    }
}