// Base class STUDENT
class STUDENT {
    String sname;
    int[] marks_array;
    int total;
    double avg;

    // Constructor to assign initial values
    public STUDENT(String sname, int[] marks_array) {
        this.sname = sname;
        this.marks_array = marks_array;
        this.total = 0;
        this.avg = 0.0;
    }

    // Method to compute total and average
    public void compute() {
        total = 0;
        for (int mark : marks_array) {
            total += mark;
        }
        avg = (double) total / marks_array.length;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Name: " + sname);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}

// Subclass ScienceStudent
class ScienceStudent extends STUDENT {
    private int practicalMarks;

    // Constructor for ScienceStudent
    public ScienceStudent(String sname, int[] marks_array, int practicalMarks) {
        super(sname, marks_array);
        this.practicalMarks = practicalMarks;
    }

    // Overriding compute method to include practical marks
    @Override
    public void compute() {
        super.compute(); // Call the base class compute method
        total += practicalMarks;
        avg = (double) total / (marks_array.length + 1); // Include practical marks in average
    }

    // Method to display practical marks
    public void displayPracticalMarks() {
        System.out.println("Practical Marks: " + practicalMarks);
    }

    @Override
    public void display() {
        super.display(); // Call the base class display method
        displayPracticalMarks(); // Display practical marks
    }
}

// Subclass ArtsStudent
class ArtsStudent extends STUDENT {
    private String electiveSubject;

    // Constructor for ArtsStudent
    public ArtsStudent(String sname, int[] marks_array, String electiveSubject) {
        super(sname, marks_array);
        this.electiveSubject = electiveSubject;
    }

    // Method to display elective subject
    public void displayElectiveSubject() {
        System.out.println("Elective Subject: " + electiveSubject);
    }

    @Override
    public void display() {
        super.display(); // Call the base class display method
        displayElectiveSubject(); // Display elective subject
    }
}

// Main class to demonstrate functionality
public class Main {
    public static void main(String[] args) {
        // Create objects of STUDENT, ScienceStudent, and ArtsStudent
        int[] marks1 = {85, 90, 88};
        ScienceStudent scienceStudent = new ScienceStudent("John Doe", marks1, 95);

        int[] marks2 = {78, 82, 80};
        ArtsStudent artsStudent = new ArtsStudent("Jane Doe", marks2, "History");

        // Compute and display information for ScienceStudent
        scienceStudent.compute();
        scienceStudent.display();
        System.out.println();

        // Compute and display information for ArtsStudent
        artsStudent.compute();
        artsStudent.display();
    }
}
