class Bank {
    double getRate() {
        return 5.5;
    }
}

class SBI extends Bank {
    double getRate() {
        return 6.7;
    }
}

class HDFC extends Bank {
    double getRate() {
        return 7.2;
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Rate: " + b.getRate());

        b = new HDFC();
        System.out.println("HDFC Rate: " + b.getRate());
    }
}
