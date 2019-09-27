import java.util.Scanner;
public class Sca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n1, n2;	
	Scanner scannerObject = new Scanner(System.in);
	
	System.out.println("Enter two whole numbers");
	System.out.println("separated by one or more spaces:");
	
	n1 = scannerObject.nextInt( );
	n2 = scannerObject.nextInt( );
	System.out.println("You entered " + n1 + " and " + n2);
	
	System.out.println("Next enter two numbers.");
	System.out.println("Decimal points are allowed.");

	}

}
