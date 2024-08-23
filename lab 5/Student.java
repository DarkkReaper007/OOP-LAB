
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Student{
	int registrationNumber;
	String fullName;
	GregorianCalendar dateofJoining;
	short semester;
	float gpa;
	float cgpa;
	
	public Student(int reg, String name, GregorianCalendar date, short sem, float g, float c){
		this.registrationNumber = reg;
		this.fullName = name;
		this.dateofJoining = date;
		this.semester = sem;
		this.gpa = g;
		this.cgpa = c;
	}

	public void display(){

		

		System.out.println("Registration Number: " + registrationNumber);
		System.out.println("Full Name: " + fullName);
		
		System.out.println("Semester: " + semester);
		System.out.println("GPA: " + gpa);
		System.out.println("CGPA: " + cgpa);
	}
	public static int generateRegistrationNumber(int year, int studentCount){
		return (year % 100) * 100 + studentCount;

	}



	public static void main(String[] args){
		final int numStudents = 5;
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[numStudents];
		for(int i=0; i<numStudents; i++){
			System.out.println("Enter details for student " + (i+1) + ":");
			System.out.println("Enter name of the student: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter year: ");
			int year = sc.nextInt();
			System.out.println("Enter student number: ");
			int studentNumber = sc.nextInt();
			int regnum = generateRegistrationNumber(year, studentNumber);

			sc.nextLine();
		
			
			System.out.println("Enter month of joining ");
			int month = sc.nextInt();
			System.out.println("Enter date of joining ");
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
		System.out.println("Student Records: ");
		for(Student student : students){
			student.display();
			System.out.println();
		}
		
	}
}
			
			

