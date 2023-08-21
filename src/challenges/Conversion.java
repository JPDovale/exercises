package challenges;

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);

		System.out.println("Insira o sálario do mês restrasado: ");
		String firstWageInput = entry.nextLine().replace(",", ".");

		System.out.println("Insira o sálario do mês passado: ");
		String secondWageInput = entry.nextLine().replace(",", ".");
		
		System.out.println("Insira o sálario do mês atual: ");
		String tertiaryWageInput = entry.nextLine().replace(",", ".");
		
		Double firstWage = Double.parseDouble(firstWageInput);
		Double secondWage = Double.parseDouble(secondWageInput);
		Double tertiaryWage = Double.parseDouble(tertiaryWageInput);
		
		double sumOfWages = firstWage + secondWage + tertiaryWage;
		double averageWage = sumOfWages / 3;
		
		System.out.printf("A soma total do sálario dos ultimos três meses são R$%.2f e a média de remuneração por mês é aproximadamente R$%.2f", sumOfWages, averageWage);
		
		entry.close();
	}
}
