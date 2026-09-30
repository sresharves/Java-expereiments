class Payment {

    void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made");
    }

    // Method Overloading
    void makePayment(double amount, String method, String receiver) {
        System.out.println("Payment of Rs." + amount
                + " made using " + method
                + " to " + receiver);
    }
}


// Child class
class UPIPayment extends Payment {

    // Method Overriding
    @Override
    void makePayment(double amount) {
        System.out.println("UPI Payment of Rs." + amount
                + " made successfully");
    }
}


// Main class
public class Exp5 {

    public static void main(String[] args) {

        // Compile-time polymorphism
        Payment p = new Payment();

        p.makePayment(1000);
        

        p.makePayment(1500, "Credit Card", "Net Banking");

        System.out.println();

        // Runtime polymorphism
        Payment payment = new UPIPayment();

        payment.makePayment(2500);
    }
}