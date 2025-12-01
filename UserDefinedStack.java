class MyStack {
    int top = -1;
    int[] arr = new int[5];

    void push(int x) {
        if (top == 4) {
            System.out.println("Stack Full");
        } else {
            arr[++top] = x;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Empty");
            return -1;
        }
        return arr[top--];
    }
}

public class UserDefinedStack {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(25);
        s.push(40);
        s.push(70);
        System.out.println("Popped = " + s.pop());
    }
}
