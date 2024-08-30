// Base class Student
class Student {
    String name;
    int id;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Derived class Sports inheriting from Student
class Sports extends Student {
    int s_grade; // Sports grade

    // Constructor
    public Sports(String name, int id, int s_grade) {
        super(name, id);
        this.s_grade = s_grade;
    }

    // Method to display sports grade
    public void displaySportsGrade() {
        System.out.println("Sports Grade: " + s_grade);
    }
}

// Derived class Exam inheriting from Student
class Exam extends Student {
    int e_grade; // Exam grade

    // Constructor
    public Exam(String name, int id, int e_grade) {
        super(name, id);
        this.e_grade = e_grade;
    }

    // Method to display exam grade
    public void displayExamGrade() {
        System.out.println("Exam Grade: " + e_grade);
    }
}

// Derived class Results using both Sports and Exam via composition
class Results {
    Sports sports; // Composition - Sports object
    Exam exam;     // Composition - Exam object
    String finalResult; // Final result

    // Constructor
    public Results(Sports sports, Exam exam) {
        this.sports = sports;
        this.exam = exam;
        calculateResult();
    }

    // Method to calculate the final result
    private void calculateResult() {
        if (sports.s_grade >= 50 && exam.e_grade >= 50) {
            finalResult = "Pass";
        } else {
            finalResult = "Fail";
        }
    }

    // Method to display the final result
    public void display() {
        sports.displayStudentInfo();
        sports.displaySportsGrade();
        exam.displayExamGrade();
        System.out.println("Final Result: " + finalResult);
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Creating objects of Sports and Exam
        Sports sports = new Sports("John Doe", 101, 85);
        Exam exam = new Exam("John Doe", 101, 90);

        // Creating object of Results
        Results result = new Results(sports, exam);

        // Displaying the final result
        result.display();
    }
}
