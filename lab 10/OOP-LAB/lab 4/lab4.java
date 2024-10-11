class STUDENT{
	String sname;
	int [] marks_array;
	int total;
	int avg;
	STUDENT(){
		this.sname="Shasmeet";
		this.marks_array = new int []{20,30,40,50};
	}
	STUDENT(String s, int [] arr){
		this.sname = s;
		this.marks_array = arr;
	}
	public void DISPLAY(){
		System.out.println(this.sname);
		for(int i=0; i<marks_array.length;i++){
			System.out.println(this.marks_array[i]);
		}	
	}
}
public class lab4{
	public static void main(String[] args){
		STUDENT c = new STUDENT();
		c.DISPLAY();
		STUDENT d = new STUDENT("gay", new int []{25, 35, 45});
		d.DISPLAY();
	}
}