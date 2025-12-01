class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " | Age: " + age);
    }
}

public class StudentConstructor {
    public static void main(String[] args) {
        Student s = new Student("Neeraj", 21);
        s.display();
    }
}
