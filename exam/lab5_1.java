import java.util.Scanner;
public class lab5_1{

	public void formatEmployeeName(String name){
		String result = "";
		boolean capital = true;
	
		for(int i=0; i<name.length(); i++){
			char currentchar = name.charAt(i);
			System.out.println(currentchar);
		
			if(capital){
				result += Character.toUpperCase(currentchar);
				//System.out.println(result);
			}
			// else{
			// 	result += Character.toLowerCase(currentchar);
			// }
	
			if(currentchar == ' '){
				capital = true;
			}
			else{
				capital = false;
			}
		}
		System.out.println(result);
	}
	public void generateEmail(String name){
		
		String trimmed = name.replace(" ","");
		String lower = trimmed.toLowerCase();
		String email = "@gmail.com";
		String email_final = lower + email;
		System.out.println(email_final);
	}
	
	public static void main(String[] args){
		lab5_1 d = new lab5_1();
		System.out.println("Enter string: ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		d.formatEmployeeName(a);
		d.generateEmail(a);
		
	}
}	