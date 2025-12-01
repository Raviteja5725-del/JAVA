public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 9) {
                System.out.println("Breaking at i = " + i);
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
