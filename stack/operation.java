package stack;

// Stack implementation
class MyStack {

    private int[] arr;
    private int capacity;
    private int top;

    // constructor
    public MyStack(int cap) {
        capacity = cap;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}

// Main class
public class operation {
    public static void main(String[] args) {

        MyStack st = new MyStack(4);

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("Popped: " + st.pop());
        System.out.println("Top element: " + st.peek());
        System.out.println("Is stack empty: " + (st.isEmpty() ? "Yes" : "No"));
        System.out.println("Is stack full: " + (st.isFull() ? "Yes" : "No"));
    }
}
