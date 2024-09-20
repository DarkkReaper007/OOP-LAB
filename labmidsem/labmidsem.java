// incomplete code for ladmidsem














import java.util.Scanner

class Customer{
    String name;
    int purchase;
    static int prem_limit = 550;
    boolean isPremiumCustomer(){
        if(purchase >= prem_limit){
            return true;
        }else{
            return false;
        }
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Purchase: " + purchase);
        System.out.println("Premium Limit: " + prem_limit);
    }
    Customer(String n, int purchase){
        this.name = n;
        this.purchase = purchase;
    }
    void getItems(int n){
        for(int i=0; i<n; i++){
            Item.item_list[i] = sc.nextLine();
        }
    }
}
class PremiumCustomer extends Customer{
    super(String n, int p);
    double rating;
}
class Item{
    private static String[] item_list;
    private static float[] item_rating;
}
public class CustomerDemo{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the number of Customers: ");
        int no_customers = sc.nextInt();
        Customer [] arr = new Customer[no_customers];
        for(int i=0; i<no_customers; i++){
            System.out.println("Name: ");
            String n = sc.nextLine();
            System.out.println("Purchase: ");
            int p = sc.nextInt();
            arr[i] = new Customer(n,p);
        }
        System.out.println("Displaying all the details");
        for(int i=0; i<no_customers; i++){
            System.out.println(arr[i].display());
        }
        PremiumCustomer [] arr2 = new PremiumCustomer[no_customers];
        int j=0;
        for(int i=0; i<no_customers; i++){
            if(arr[i].isPremiumCustomer()){
                arr2[j++] = PremiumCustomer(arr[i].name, arr[i].purchase)
                PremiumCustomer.rating = (arr[i].purchase - Customer.prem_limit) / 100;
            }
        }
        for(int i=0; i<j; i++){
            System.out.println(arr2[i].display());
        }
    }
}