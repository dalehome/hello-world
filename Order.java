// Check out the order

public class Order {

	static { System.out.println("Static Initialiser"); }

	{ System.out.println("Initialiser block"); }


	private int a = 1;

	public Order() { System.out.println("Constructor"); }

	public static void main(String[] args) {  
		System.out.println("Main Method: "); 
		System.out.println(new Order().a); 
	}
}
