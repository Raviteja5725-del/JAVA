class Box {
    int length;

    Box(int l) {
        length = l;
    }

    boolean compare(Box b) {
        return this.length == b.length;
    }
}

public class ObjectAsParameter {
    public static void main(String[] args) {
        Box b1 = new Box(15);
        Box b2 = new Box(20);

        System.out.println("Are equal? " + b1.compare(b2));
    }
}
