class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        System.out.println("Objects created: " + Counter.count);
    }
}
