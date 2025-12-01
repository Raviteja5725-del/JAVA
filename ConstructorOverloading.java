class Rectangle {
    int length, breadth;

    Rectangle() {
        length = 5;
        breadth = 3;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 7);

        System.out.println("Default Area = " + (r1.length * r1.breadth));
        System.out.println("Custom Area = " + (r2.length * r2.breadth));
    }
}
