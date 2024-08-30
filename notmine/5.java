// Abstract class Figure
abstract class Figure {
    int dimension1;
    int dimension2;

    // Constructor
    public Figure(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    // Abstract method area
    abstract double area();
}

// Rectangle class
class Rectangle extends Figure {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    double area() {
        return dimension1 * dimension2; // Area = length * width
    }
}

// Triangle class
class Triangle extends Figure {
    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    double area() {
        return 0.5 * dimension1 * dimension2; // Area = 0.5 * base * height
    }
}

// Square class
class Square extends Figure {
    public Square(int side) {
        super(side, side);
    }

    @Override
    double area() {
        return dimension1 * dimension2; // Area = side * side
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of Rectangle, Triangle, and Square
        Figure rectangle = new Rectangle(10, 20);
        Figure triangle = new Triangle(10, 15);
        Figure square = new Square(10);

        // Calling area method using Figure reference
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Square: " + square.area());
    }
}
