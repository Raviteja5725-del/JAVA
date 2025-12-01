class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;        // resolves conflict
        this.salary = salary;
    }

    void show() {
        System.out.println(name + " earns " + salary);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Employee e = new Employee("Sonia", 55000);
        e.show();
    }
}
