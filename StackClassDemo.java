import java.util.Stack;

public class StackClassDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(40);
        s.push(15);
        s.push(90);

        s.pop(); // removes 90
        s.push(55);

        System.out.println("Top = " + s.peek());
    }
}
