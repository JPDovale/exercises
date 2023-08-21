package challenges;

public class LogicOperations {
	public static void main(String[] args) {
		boolean firstWork = false;
		boolean secondWork = true;

		if (firstWork && secondWork) {
			System.out.println("Buy tv 50 pol");
			System.out.println("Ice cream for family");
		} else if (firstWork ^ secondWork) {
			System.out.println("Buy tv 32 pol");
			System.out.println("Ice cream for family");
		} else {
			System.out.println("Nothing buy's");
			System.out.println("Healthier family");
		}
	}
}
