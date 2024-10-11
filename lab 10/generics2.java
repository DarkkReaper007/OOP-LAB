import java.util.ArrayList;

class GenericStack<T> {
    private ArrayList<T> stack;
    
    public GenericStack() {
        stack = new ArrayList<>();
    }
    
    public void push(T item) {
        stack.add(item);
    }
    
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return stack.remove(stack.size() - 1);
    }
    
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return stack.get(stack.size() - 1);
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public int size() {
        return stack.size();
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', position='" + position + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        
        GenericStack<Student> studentStack = new GenericStack<>();
        studentStack.push(new Student("Alice", 20));
        studentStack.push(new Student("Bob", 22));
        
        System.out.println("Students in the stack:");
        while (!studentStack.isEmpty()) {
            System.out.println(studentStack.pop());
        }
        
        
        GenericStack<Employee> employeeStack = new GenericStack<>();
        employeeStack.push(new Employee("Charlie", "Manager"));
        employeeStack.push(new Employee("Diana", "Developer"));
        
        System.out.println("\nEmployees in the stack:");
        while (!employeeStack.isEmpty()) {
            System.out.println(employeeStack.pop());
        }
    }
}
