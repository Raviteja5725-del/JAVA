class NumberHolder {
    int num;

    NumberHolder(int n) {
        num = n;
    }

    NumberHolder increment() {
        return new NumberHolder(num + 5);
    }
}

public class ReturnObjectDemo {
    public static void main(String[] args) {
        NumberHolder n1 = new NumberHolder(25);
        NumberHolder n2 = n1.increment();

        System.out.println(n2.num);
    }
}
