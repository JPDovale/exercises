package challenges;

public class LogicOperations {
	public static void main(String[] args) {
		boolean firtWork = false;
		boolean secondWork = true;
		
		if(firtWork && secondWork) {
			System.out.println("Buy tv 50 pol");
			System.out.println("Icecream for family");
		}else if(firtWork ^ secondWork) {
			System.out.println("Buy tv 32 pol");
			System.out.println("Icecream for family");
		}else {
			System.out.println("Nothing byed");
			System.out.println("Healthier family");
		}
	}
}
