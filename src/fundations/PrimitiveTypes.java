package fundations;

public class PrimitiveTypes {
	public static void main(String[] args) {
		// fully
		byte yearsOfCompany = 23;
		short numberOfFlys = 542;
		int id = 56789;
		long points = 3_134_845_223L;
		
		// floats
		float wage = 13_987.44F;
		double cumulativeSales =  2_991_797_103.01;
		
		// booleans
		boolean isOnVacation = false;
		
		// character
		char status = 'A';

		// days of company
		System.out.println("O funcionário => " + id + " tem " + yearsOfCompany * 365 + " dias de empresa");

		// number of trips
		System.out.println("O funcionário => " + id + " fez " + numberOfFlys / 2 + " viagens");
		
		// points per Real
		System.out.println("O funcionário => " + id + " ganhou " + points / cumulativeSales + " por real vendido");
		
		System.out.println("O funcionário => " + id + " ganha " + wage + " reais");
		System.out.println("O funcionário => " + id + " esta de férias? " + isOnVacation);
		System.out.println("O funcionário => " + id + " tem o status " + status);
		
	}
}
