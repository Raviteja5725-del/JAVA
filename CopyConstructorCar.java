class CarCopy {
    String brand;
    int price;

    CarCopy(String b, int p) {
        brand = b;
        price = p;
    }

    CarCopy(CarCopy c) {
        brand = c.brand;
        price = c.price;
    }
}

public class CopyConstructorCar {
    public static void main(String[] args) {
        CarCopy c1 = new CarCopy("BMW", 4500000);
        CarCopy c2 = new CarCopy(c1);

        System.out.println(c2.brand + " | Rs." + c2.price);
    }
}
