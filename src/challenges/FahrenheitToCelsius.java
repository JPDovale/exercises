package challenges;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		final int SACALE_DIF_BETWEEN_C_AND_F = 32;
		final double RELATIONSHI_BETWEEN_INTERVALS_C_AND_F = 5.0 / 9.0;
		
		double fahrenheit = 86.0;
		double celsius = (fahrenheit - SACALE_DIF_BETWEEN_C_AND_F) * RELATIONSHI_BETWEEN_INTERVALS_C_AND_F;
		System.out.println(fahrenheit + " graus fahrenheit são " + celsius + " graus celsius.");
		
		fahrenheit = 158.0;
		celsius = (fahrenheit - SACALE_DIF_BETWEEN_C_AND_F) * RELATIONSHI_BETWEEN_INTERVALS_C_AND_F;
		System.out.println(fahrenheit + " graus fahrenheit são " + celsius + " graus celsius.");
	}
}
