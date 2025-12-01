class Parent {
    int value = 50;

    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    int value = 100;

    void show() {
        System.out.println("Child show()");
        System.out.println("Parent value = " + super.value);
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
