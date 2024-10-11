public class lab7_1m{
    public static void main(String[] args){
        stack s = new stack(5);
        try{
            s.push(1);
            s.push(2);
            s.push(3);
            s.display(s);
            s.push(4);
            s.push(5);
            s.display(s);
            s.push(2);
        }catch(PushException e){
            System.out.println(e.getMessage());

        }

        try{
           System.out.println(s.pop());
           System.out.println(s.pop());
           System.out.println(s.pop());
           System.out.println(s.pop());
           System.out.println("No error uptil now");
           System.out.println(s.pop());
        }catch(PopException e){
            System.out.println(e.getMessage());
        }
    }
}






class PushException extends Exception{
    public PushException(String message){
        super(message);
    }
}
class PopException extends Exception{
    public PopException(String message){
        super(message);
    }
}
class stack{
    private int capacity;
    private int top;
    private int[] stackarr;

    public stack(int capacity){
        this.top = -1;
        this.capacity = capacity;
        this.stackarr = new int[capacity];
    }
    public void push(int item) throws PushException{
        if(top == capacity - 1){
            throw new PushException("Stack is full");
        }
        stackarr[++top] = item;
    }
    public int pop() throws PopException{
        if(top == -1){
            throw new PopException("Stack is empty");
        }
        return stackarr[top--];
    }
    public void display(stack s){
        for(int i=0; i<=top; i++){
            System.out.println(s.stackarr[i]);
        }
    }
}
