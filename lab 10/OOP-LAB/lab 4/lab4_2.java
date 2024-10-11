class EMPLOYEE{
	String Ename;
	int Eid;
	int Basic;
	int DA;
	int Gross_Sal;
	int Net_Sal;
	EMPLOYEE(){
		this.Ename = "Shasmeet";
		this.Eid = 1406;
		this.Basic=10000000;
	}
	EMPLOYEE(String s, int e, int b){
		this.Ename = s;
		this.Eid = e;
		this.Basic = b;
	}
	public void display(){
		System.out.println("Name: " + Ename);	
		System.out.println("Eid: " + Eid);
		System.out.println("Basic: " + Basic);
	}	
}
class lab4_2{
	public static void main(String[] args){
		EMPLOYEE a = new EMPLOYEE();
		a.display();
		EMPLOYEE b = new EMPLOYEE("gay", 77, 2);
		b.display();
	}
}
		