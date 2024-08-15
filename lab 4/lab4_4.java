class Counter{
	static int count=0;	
	Counter(int n){
		count++;
	}
	
	static void showCount(){
		System.out.println("Count:"+ count);		
	}
}
public class lab4_4{
	public static void main(String[] args){
		Counter a = new Counter(1);
		Counter.showCount();
		Counter b = new Counter(1);
		Counter.showCount();
	}
}

		
	