
class PushException extends Exception {
    public PushException(String message) {
        super(message);
    }
}

class PopException extends Exception {
    public PopException(String message) {
        super(message);
    }
}


class Stack {
    private int capacity;
    private int[] stack;
    private int top;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public void push(int item) throws PushException {
        if (top >= capacity - 1) {
            throw new PushException("Stack is full. Cannot push new item.");
        }
        stack[++top] = item;
    }

    public int pop() throws PopException {
        if (top < 0) {
            throw new PopException("Stack is empty. Cannot pop item.");
        }
        return stack[top--];
    }

    public int peek() throws PopException {
        if (top < 0) {
            throw new PopException("Stack is empty. Cannot peek item.");
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top >= capacity - 1;
    }

    public int size() {
        return top + 1;
    }
}


public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(3);
        

        try {
            myStack.push(1);
            myStack.push(2);
            myStack.push(3);
            System.out.println("Stack after pushes: " + myStack.size());

        
            myStack.push(4); 
        } catch (PushException e) {
            System.out.println(e.getMessage());
        }

        
        try {
            System.out.println("Popped element: " + myStack.pop());
            System.out.println("Popped element: " + myStack.pop());
            System.out.println("Popped element: " + myStack.pop());
            
            
            myStack.pop(); 
        } catch (PopException e) {
            System.out.println(e.getMessage());
        }
    }
}
