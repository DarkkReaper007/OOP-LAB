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