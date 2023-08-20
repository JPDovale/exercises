package fundations;

public class CircumferenceArea {
	public static void main(String[] args) {
		double radius = 3;
		final double PI = 3.14159;
		
		double area = PI * radius * radius;
		System.out.println("Área = " + area + " m2.");
		
		radius = 10;
		area = PI * radius * radius;
		System.out.println("Área = " + area + " m2.");
	}
}
