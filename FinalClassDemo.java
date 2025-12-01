final class GovernmentPolicy {
    void showPolicy() {
        System.out.println("No class can extend this policy.");
    }
}

public class FinalClassDemo {
    public static void main(String[] args) {
        GovernmentPolicy g = new GovernmentPolicy();
        g.showPolicy();
    }
}
