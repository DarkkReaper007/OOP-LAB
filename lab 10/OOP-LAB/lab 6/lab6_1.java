/*
To the already defined STUDENT class, add two subclasses ScienceStudent and 
ArtsStudent. Add a private data member practicalMarks (int): to the ScienceStudent 
class to represent the marks obtained by the student in the practical subject. The 
ScienceStudent class should override the compute() method to include the practical 
marks in the total marks and average marks calculation. The ScienceStudent class 
should provide a method displayPracticalMarks() to display the practical marks 
obtained by the science student. Add the private data member electiveSubject 
(String): to the ArtsStudent class to represent the elective subject chosen by the arts 
student. Also add appropriate constructors to the subclasses. In the Main class, create 
objects of STUDENT, ScienceStudent, and ArtsStudent, and demonstrate the 
keyword ‘super’ and other functionalities of the classes by assigning values, 
computing marks, and displaying the information of the students. Also demonstrate 
dynamic polymorphism.
*/


import java.util.Scanner;

public class lab6_1{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        STUDENT a = new STUDENT();
		System.out.println("Enter practical marks: ");
		int d = sc.nextInt();
		System.out.println("Enter elective: ");
		String f = sc.next();
		ScienceStudent b = new ScienceStudent(d);
		ArtsStudent c = new ArtsStudent(f);

		b.display();
		c.display();


    }

}

class STUDENT{
	String sname;
	int [] marks_array = new int[5];
	int total=0;
	int avg;

	public void assign(String sname){
		Scanner sc = new Scanner(System.in);
		this.sname = sname;
		
		System.out.println("Enter the marks: ");
		for(int i=0; i<5; i++){
			marks_array[i] = sc.nextInt();
		}
	}
	public void compute(){
		for(int i=0; i<marks_array.length; i++){
			this.total += marks_array[i];
		}
		this.avg = this.total / marks_array.length;	
	}
	public void display(){
		System.out.println(sname);
		System.out.println("The marks are: ");
		for(int i=0; i<marks_array.length; i++){
			System.out.print(marks_array[i] + " ");
		}
		System.out.println();
		System.out.println("THe total is: ");
		System.out.println(total);
		System.out.println("The average is: ");
		System.out.println(avg);
	}

	
}
class ScienceStudent extends STUDENT{
	Scanner sc = new Scanner(System.in);
	private int practicalMarks;
	

	ScienceStudent(int a){
		System.out.println("Enter name(ScienceStudent): ");
		String n = sc.next();
		super.assign(n);
		super.compute();
        this.practicalMarks = a;
    }

	@Override
	public void compute(){
		super.compute();
		this.avg = this.practicalMarks + this.total / (1+ marks_array.length);
	}
	@Override
	public void display(){
		super.display();
		System.out.println(practicalMarks);
	}
}
class ArtsStudent extends STUDENT{
    Scanner sc = new Scanner(System.in);
	private String electiveSubject;
	
	//super.compute();
	
    ArtsStudent(String a){
		System.out.println("Enter name(ArtsStudent): ");
		String z = sc.next();
		super.assign(z);
		super.compute();
        this.electiveSubject = a;
    }
	@Override
	public void display(){
		super.display();
		System.out.println("Elective chosen is " + this.electiveSubject);
	}

}

/*

Enter practical marks: 
25
Enter elective: 
ml
Enter name(ScienceStudent): 
Shasmeet
Enter the marks: 
23
34
45
56
67
Enter name(ArtsStudent): 
bob
Enter the marks: 
23
34
45
56
67
Shasmeet
The marks are: 
23 34 45 56 67 
THe total is: 
225
The average is: 
45
25
bob
The marks are: 
23 34 45 56 67 
THe total is: 
225
The average is: 
45
Elective chosen is ml
*/
