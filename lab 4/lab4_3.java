class Bank_account{
	String Name;
	double Acc_no;
	String type;
	double Balance;
	static int rate;
	Bank_account(){
		this.Name = "ram";
		this.Acc_no = 12345;
		this.type = "savings";
		this.Balance = 100;
		this.rate = 12;
	}
	Bank_account(String N, double a, String t, double bal, int r){
		this.Name = N;
		this.Acc_no = a;
		this.type = t;
		this.Balance = bal;
		this.rate = r;
	}

	public void Deposit(double value){
		this.Balance += value;
	}
	public void Withdraw(double value){
		
		if(value>this.Balance){
			System.out.println("Cant withdraw");
			System.exit(0);
		}
		if(value>80){
			System.out.println("Minimum balance reached");
		}
		this.Balance -= value;
	}
	public void display(){
		System.out.println("Name: " + this.Name);
		System.out.println("Acc_no: " + this.Acc_no);
		System.out.println("Type: " + this.type);
		System.out.println("Balance: " + this.Balance);
		System.out.println("Rate: " + this.rate);
	}
	public static void rate_of_interest(){
		System.out.println("Rate of interest: " + rate);
	}
}
public class lab4_3{
	public static void main(String[] args){
		Bank_account a = new Bank_account();
		a.display();
		Bank_account b = new Bank_account("gay", 12345, "savings", 20, 2);
		b.display();
		a.Deposit(100);
		a.display();
		a.Withdraw(45);
		a.display();
		Bank_account.rate_of_interest();
	}
}

		
		