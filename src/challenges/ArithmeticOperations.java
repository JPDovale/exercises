package challenges;

public class ArithmeticOperations {
	public static void main(String[] args) {
		//  first side of equation
		int a = (int) Math.pow(6 * (3 + 2), 2);
		int b = 3 * 2;
		int c = a / b;
		
		// second side of equation
		int x = (1 - 5) * ( 2 - 7);
		int y = x / 2;
		int z = (int) Math.pow(y, 2);
		
		
		int upper = (int) Math.pow(c - z, 3);
		int down = (int) Math.pow(10, 3);
		
		int result = upper / down;
		
		System.out.println(result);
	}
}
