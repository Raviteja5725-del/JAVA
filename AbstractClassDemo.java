abstract class Employee {
    abstract double calculateSalary();
    
    void showRole() {
        System.out.println("General Employee");
    }
}

class FullTimeEmployee extends Employee {
    double calculateSalary() {
        return 40000;
    }
}

class PartTimeEmployee extends Employee {
    double calculateSalary() {
        return 20000;
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
    }
}
