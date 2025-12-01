class Teacher {
    void teach() {
        System.out.println("Teaching students...");
    }
}

class MathTeacher extends Teacher {
    void mathClass() {
        System.out.println("Solving algebra problems");
    }
}

class ScienceTeacher extends Teacher {
    void scienceClass() {
        System.out.println("Explaining physics concepts");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        MathTeacher m = new MathTeacher();
        m.teach();
        m.mathClass();

        ScienceTeacher s = new ScienceTeacher();
        s.teach();
        s.scienceClass();
    }
}
