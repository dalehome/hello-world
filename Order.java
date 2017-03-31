// Check out the order
// This is an ibndication of the order java idioms are parsed and executed
public class Order {

	static { System.out.println("Static Initialiser"); }

	{ System.out.println("Initialiser block"); }


	private int a = 1;

	public Order() { System.out.println("Constructor: "); System.out.println(a++); }



	public static void main(String[] args) {  System.out.println("Main Method: " + 3); System.out.println(new Order().a); }



}
