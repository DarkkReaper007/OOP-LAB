// wap a program that maintains course and section details of subjects offered in a semester. Create a class Section with instance variables course, section, semester and year. Perform the following tasks:
//1) Provide a parameterised constructor to initialise the variables and include dislaySectionInfo() method to display the details of a section
//2) Create an array of sections in a demo class after reading the details from the console input. Also, display the details of all sections.
//3) Implement a static method addCourse(String courseName) inside a Couse class. This method adds the course to an array of courses only if MAX_COURSE is not exceeded Also display the courses added to this array through another static method displayCouseList().
import java.util.Scanner;
public class exam{
	public static void main(String[] args){
		demo a = new demo();
		a.read_course();
		a.read_input();
	}
}		


class Section{
	String course;
	String section;
	int semester;
	int year;

	Section(String s, String section, int sem, int year){
		this.course = s;
		this.section = section;
		this.semester = sem;
		this.year = year;
	}
	public void displaySectionInfo(){
		System.out.println("Course: \t" + course + "Section: \t" + section + "semester\t" + semester + "Year\t" + year);
	}
}
class demo{
	Scanner sc = new Scanner(System.in);
	int section;
	public void read_course(){
		System.out.println("How many sections: ");
		System.out.println(this.section);

		this.section = sc.nextInt();
		System.out.println(this.section);

	}

	
	public void read_input(){
	System.out.println(this.section);
	Section [] arr = new Section[this.section];
	
	for(int i=0; i<section; i++){
		System.out.println("Enter the detials of section" + (i+1));
		System.out.println("Course: ");
		String a = sc.next();
		System.out.println("Section: ");
		String b= sc.next();
		System.out.println("Semester: ");
		int c = sc.nextInt();
		System.out.println("Year: ");
		int d = sc.nextInt();
		arr[i] = new Section(a,b,c,d);
	}
	for(int i=0; i<section; i++){
		arr[i].displaySectionInfo();
	}
	}
}
