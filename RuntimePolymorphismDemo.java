class Payment {
    void pay() {
        System.out.println("General Payment");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("Paid using UPI");
    }
}

class Card extends Payment {
    void pay() {
        System.out.println("Paid using Card");
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        Payment p;

        p = new UPI();
        p.pay();

        p = new Card();
        p.pay();
    }
}
