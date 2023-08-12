import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        double num1 = scanner.nextDouble();

		        System.out.print("Enter the second number: ");
		        double num2 = scanner.nextDouble();

		        System.out.print("Enter the operator (+, -, *, /): ");
		        char operator = scanner.next().charAt(0);

		        double result = calculate(num1, num2, operator);
		        System.out.println("Result: " + result);

		        scanner.close();
		    }

		    public static double calculate(double num1, double num2, char operator) {
		        switch (operator) {
		            case '+':
		                return num1 + num2;
		            case '-':
		                return num1 - num2;
		            case '*':
		                return num1 * num2;
		            case '/':
		                if (num2 != 0) {
		                    return num1 / num2;
		                } else {
		                    System.out.println("Error: Division by zero");
		                    return Double.NaN; //not a number
		                    
		                }
		            default:
		                System.out.println("Error: Invalid operator");
		                return Double.NaN;
		        }
		    }
		}
