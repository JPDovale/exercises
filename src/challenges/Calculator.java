package challenges;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter operation you need:");
    System.out.println("Accepted operations: \"+\" \"-\" \"*\" \"/\" \"%\"");
    String operator = keyboard.next();

    System.out.println("Enter a number: ");
    double num1 = Double.parseDouble(keyboard.next());

    System.out.println("Enter another number: ");
    double num2 = Double.parseDouble(keyboard.next());

    switch (operator) {
      case "+": {
        double result = num1 + num2;
        System.out.printf("The result of operation %.2f %s %.2f is %.2f", num1, operator, num2, result);
        break;
      }

      case "-": {
        double result = num1 - num2;
        System.out.printf("The result of operation %.2f %s %.2f is %.2f", num1, operator, num2, result);
        break;
      }

      case "*": {
        double result = num1 * num2;
        System.out.printf("The result of operation %.2f %s %.2f is %.2f", num1, operator, num2, result);
        break;
      }

      case "/": {
        double result = num1 / num2;
        System.out.printf("The result of operation %.2f %s %.2f is %.2f", num1, operator, num2, result);
        break;
      }

      case "%": {
        double result = num1 % num2;
        System.out.printf("The result of operation %.2f %s %.2f is %.2f", num1, operator, num2, result);
        break;
      }

      default: {
        System.out.println("Invalid operation");
        break;
      }
    }

    keyboard.close();
  }
}
