class Laptop {
    Laptop() {
        System.out.println("Laptop: Constructor");
    }
}

class GamingLaptop extends Laptop {
    GamingLaptop() {
        super();
        System.out.println("GamingLaptop: Constructor");
    }
}

public class SuperConstructorDemo {
    public static void main(String[] args) {
        GamingLaptop g = new GamingLaptop();
    }
}
