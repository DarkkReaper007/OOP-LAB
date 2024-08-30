import java.util.Arrays;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Student {
    int registrationNumber;
    String fullName;
    GregorianCalendar dateofJoining;
    short semester;
    float gpa;
    float cgpa;

    public Student(int reg, String name, GregorianCalendar date, short sem, float g, float c) {
        this.registrationNumber = reg;
        this.fullName = name;
        this.dateofJoining = date;
        this.semester = sem;
        this.gpa = g;
        this.cgpa = c;
    }

    public void display() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Semester: " + semester);
        System.out.println("GPA: " + gpa);
        System.out.println("CGPA: " + cgpa);
    }

    public static int generateRegistrationNumber(int year, int studentCount) {
        return (year % 100) * 100 + studentCount;
    }

    // Function to sort by semester and CGPA
    public static void sortBySemesterAndCGPA(Student[] students) {
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.semester == s2.semester) {
                    return Float.compare(s2.cgpa, s1.cgpa); // Descending order of CGPA
                }
                return Short.compare(s1.semester, s2.semester); // Ascending order of Semester
            }
        });
    }

    // Function to sort by name
    public static void sortByName(Student[] students) {
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.fullName.compareTo(s2.fullName);
            }
        });
    }

    // Function to list students whose names start with a particular character
    public static void listByStartingCharacter(Student[] students, char ch) {
        for (Student student : students) {
            if (student.fullName.charAt(0) == ch) {
                student.display();
                System.out.println();
            }
        }
    }

    // Function to list all student names containing a particular substring
    public static void listBySubstring(Student[] students, String substring) {
        for (Student student : students) {
            if (student.fullName.contains(substring)) {
                student.display();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        final int numStudents = 5;
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[numStudents];

        // Input student details
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.println("Enter name of the student: ");
            String name = sc.next();
            System.out.println("Enter year: ");
            int year = sc.nextInt();
            System.out.println("Enter student number: ");
            int studentNumber = sc.nextInt();
            int regnum = generateRegistrationNumber(year, studentNumber);

            System.out.println("Enter month of joining: ");
            int month = sc.nextInt();
            System.out.println("Enter date of joining: ");
            int day = sc.nextInt();
            GregorianCalendar date = new GregorianCalendar(year, month, day);

            System.out.println("Enter semester: ");
            short semester = sc.nextShort();
            System.out.println("Enter GPA: ");
            float gpa = sc.nextFloat();
            System.out.println("Enter CGPA: ");
            float cgpa = sc.nextFloat();

            students[i] = new Student(regnum, name, date, semester, gpa, cgpa);
        }

        // Display all student records
        System.out.println("\nStudent Records:");
        for (Student student : students) {
            student.display();
            System.out.println();
        }

        // Sort and display by semester and CGPA
        System.out.println("Sorting by Semester and CGPA:");
        sortBySemesterAndCGPA(students);
        for (Student student : students) {
            student.display();
            System.out.println();
        }

        // Sort and display by name
        System.out.println("Sorting by Name:");
        sortByName(students);
        for (Student student : students) {
            student.display();
            System.out.println();
        }

        // List students whose names start with a particular character
        System.out.println("Students whose names start with 'A':");
        listByStartingCharacter(students, 'A');

        // List students whose names contain a particular substring
        System.out.println("Students whose names contain 'John':");
        listBySubstring(students, "John");

        sc.close();
    }
}
