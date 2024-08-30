import java.util.Scanner;

class Person {
    private String name;
    private String birthDate;

    // Constructor for Person
    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Accessor methods for name and birthDate
    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    // Method to display Person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + birthDate);
    }
}

class CollegeGraduate extends Person {
    private double gpa;
    private int yearOfGraduation;

    // Constructor for CollegeGraduate
    public CollegeGraduate(String name, String birthDate, double gpa, int yearOfGraduation) {
        super(name, birthDate); // Call the constructor of the Person class
        this.gpa = gpa;
        this.yearOfGraduation = yearOfGraduation;
    }

    // Accessor methods for GPA and year of graduation
    public double getGPA() {
        return gpa;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    // Method to display CollegeGraduate details
    public void displayGraduateDetails() {
        super.displayPersonDetails(); // Display Person details
        System.out.println("GPA: " + gpa);
        System.out.println("Year of Graduation: " + yearOfGraduation);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a CollegeGraduate object and demonstrate the classes
        Scanner sc = new Scanner(System.in);

        // Input details
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter birth date (yyyy-mm-dd): ");
        String birthDate = sc.nextLine();

        System.out.println("Enter GPA: ");
        double gpa = sc.nextDouble();

        System.out.println("Enter year of graduation: ");
        int yearOfGraduation = sc.nextInt();

        // Create CollegeGraduate object
        CollegeGraduate graduate = new CollegeGraduate(name, birthDate, gpa, yearOfGraduation);

        // Display the details of the CollegeGraduate object
        System.out.println("\nCollege Graduate Details:");
        graduate.displayGraduateDetails();
    }
}
