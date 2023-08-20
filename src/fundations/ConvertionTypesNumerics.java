package fundations;

public class ConvertionTypesNumerics {
	public static void main(String[] args) {
		double a = 1; // implicit conversion
		System.out.println(a);
		
		float b = (float) 1.365123126389; // explicit conversion (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // explicit conversion (CAST)
		System.out.println(c + " => " + d);
		
		double e = 1.999999999;
		int f = (int) e; // explicit conversion (CAST)
		System.out.println(f);
	}
}
