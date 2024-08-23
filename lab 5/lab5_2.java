import java.util.Scanner;
import java.util.Arrays;
class STUDENT{
	public static void extractInitials(String name){
		String initials="";
		char currentchar = ' ';
		for(int i=0; i<name.length(); i++){
			currentchar = name.charAt(i);
			if(i==0){
				initials += currentchar;
			}
			if(currentchar == ' '){
				initials +=name.charAt(i+1);
			}
		}
		System.out.println(initials);	
	}
	public static void substring_checker(String name, String substring){
		boolean check = name.contains(substring);
		if(check){
			System.out.println(name);
		}
		
	}
	public static void sort(String []arr){
		Arrays.sort(arr);
	}
	

	public static void spaceremove(String name){
		
		String trim = name.trim();
		String result = trim.replace(" ","");
		System.out.println(result);
	}
	public static void main(String[] args){
		System.out.println("Enter the name: ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		extractInitials(a);
		spaceremove(a);
		System.out.println("Enter the number of students: ");
		int n = sc.nextInt();
		String [] students = new String[n];
		System.out.println("Enter the students: ");
		sc.nextLine();
		for(int i=0; i<n; i++){
			students[i] = sc.nextLine();
													}
		System.out.println("Enter substring: ");
		String sub = sc.nextLine();
		for(int i=0; i<n; i++){
			substring_checker(students[i], sub);
		}
		sort(students);
		System.out.println("The sorted list of students are: ");
		for(int i=0; i<n; i++){
			System.out.println(students[i]);
		}
	
								
	
	}
}