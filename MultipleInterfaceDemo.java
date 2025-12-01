interface Camera {
    void clickPhoto();
}

interface GPS {
    void navigate();
}

class Smartphone implements Camera, GPS {
    public void clickPhoto() {
        System.out.println("Photo clicked!");
    }

    public void navigate() {
        System.out.println("Navigating...");
    }
}

public class MultipleInterfaceDemo {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.clickPhoto();
        s.navigate();
    }
}
