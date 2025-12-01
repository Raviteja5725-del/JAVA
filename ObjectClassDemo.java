class Person {
    String name;
    int age;

    public String toString() {
        return "Person(name=" + name + ", age=" + age + ")";
    }

    public int hashCode() {
        return age * 31;
    }
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Karan";
        p.age = 22;

        System.out.println(p.toString());
        System.out.println("HashCode = " + p.hashCode());
    }
}
