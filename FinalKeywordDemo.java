class Constants {
    final int MAX_SPEED = 120;

    final void rules() {
        System.out.println("Follow traffic rules");
    }
}

class Bike extends Constants {
    // Cannot override final method rules()
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println("Max Speed: " + b.MAX_SPEED);
        b.rules();
    }
}
