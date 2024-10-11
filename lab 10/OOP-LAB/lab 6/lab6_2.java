/*
To the already defined EMPLOYEE class, add two subclasses FullTimeEmp and 
PartTimeEmp. Add the following data Members and Member Functions to the 
PartTimeEmp class. hoursWorked (int): Represents the number of hours worked by the 
part-time employee. hourlyRate (double, static and final): Represents the hourly rate at 
which the part-time employee is paid. The calculateSalary(): Overrides the 
calculateSalary() method of the base class to calculate the salary of the part-time 
employee based on the hours worked and hourly rate. The displayEmployeeDetails(): 
Overrides the displayEmployeeDetails() method of the base class to display the part-time 
employee's details, including the hours worked and hourly rate.
The FullTimeEmployee subclass includes the data members bonus and deductions as 
additional data members and are of type double, and overrides the calculateSalary() and 
displayEmployeeDetails() methods to incorporate these factors. Define Main class to 
check the functionality of all the classes.

*/



import java.util.Scanner;

public class lab6_2{
    public static void main(String[] args){
        PartTimeEmp d = new PartTimeEmp();
        FullTimeEmp e = new FullTimeEmp();

    
        d.compute();
        d.display();

        e.compute();
        e.display();

        



    }
    
}
class EMPLOYEE{
	String Ename;
	int Eid;
	int Basic;
	int DA;
	int Gross_Sal;
	int Net_Sal;
	
	Scanner sc = new Scanner(System.in);

	public void read(){
		System.out.println("Enter name:");
		Ename = sc.nextLine();
		System.out.println("Enter Eid: ");
		Eid =sc.nextInt();
		System.out.println("Enter Basic: ");
		Basic = sc.nextInt();
		
	}
	public void display(){
		System.out.println("Employee Name: " + Ename);
		System.out.println("Employee ID: " + Eid);
		System.out.println("Basic Salary:" + Basic);
		System.out.println("DA:" + DA);
		System.out.println("Gross_Salary: " + Gross_Sal);
		System.out.println("Net_Salary: " + Net_Sal);
	}
	public void compute(){
		this.DA = (52 * Basic) / 100;
		this.Gross_Sal = this.Basic + DA;
		this.Net_Sal = this.Gross_Sal - (30 * this.Gross_Sal)/100;

	}
}    
class PartTimeEmp extends EMPLOYEE{
    
    final static double hourlyrate = 5;
    int hours;
    PartTimeEmp(){
        System.out.println("Enter details for PartTimeEmployee: ");
        super.read();
        // System.out.println("Enter hourly rate: ");
        // this.hourlyrate = sc.nextInt();
        
        System.out.println("Enter hours worked: ");
        this.hours = sc.nextInt();
        
    }
    @Override
    public void compute(){
        // System.out.println("Enter hours worked");
        // int hours = sc.nextInt();
        super.Basic += hourlyrate * hours;
        super.compute();
        

    }
    @Override
    public void display(){
        System.out.println("PartTimeEmployee");
        super.display();
        System.out.println("HourlyRate: " + hourlyrate);
        
    }
}
class FullTimeEmp extends EMPLOYEE{
    int bonus;
    FullTimeEmp(){
        System.out.println("Enter details for FullTimeEmployee: ");
        super.read();
        System.out.println("Enter Bonus for FullTimeEmployee: ");
        this.bonus = sc.nextInt();
    }
    @Override
    public void compute(){
        super.compute();
        super.Net_Sal += bonus;
    }
    @Override
    public void display(){
        System.out.println("FullTimeEmployee: ");
        super.display();
    }
}

/*

java -cp /tmp/cznCyn2ybm/lab6_2
Enter details for PartTimeEmployee: 
Enter name:
Shasmeet
Enter Eid: 
12
Enter Basic: 
2345
Enter hours worked: 
12
Enter details for FullTimeEmployee: 
Enter name:
gefdvffsd
Enter Eid: 
1234
Enter Basic: 
234566
Enter Bonus for FullTimeEmployee: 
1234
PartTimeEmployee
Employee Name: Shasmeet
Employee ID: 12
Basic Salary:2405
DA:1250
Gross_Salary: 3655
Net_Salary: 2559
HourlyRate: 5.0
FullTimeEmployee: 
Employee Name: gefdvffsd
Employee ID: 1234
Basic Salary:234566
DA:121974
Gross_Salary: 356540
Net_Salary: 250812

*/
