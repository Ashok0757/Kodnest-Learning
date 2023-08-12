import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the purchase amount:");
		double purchaseAmount =sc.nextDouble();
		System.out.println("Enter the tax rate:");
		double taxRate = sc.nextDouble();
		sc.close();
	double result = calculateTotalWithTax( purchaseAmount, taxRate);
	System.out.println("Total cost including tax: "+result);
				}
	public static double calculateTotalWithTax(double purchaseAmount,double taxRate) {
		double result = purchaseAmount*taxRate;
		return result+purchaseAmount;
		}
	}
