class Car {
    String model;
    int year;

    void showInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class CarInfo {
    public static void main(String[] args) {
        Car c = new Car();
        c.model = "Honda City";
        c.year = 2020;
        c.showInfo();
    }
}
