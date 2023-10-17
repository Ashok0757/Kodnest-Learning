import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		sc.close();
		calculateSumOfDigits(n);
		}
	public static void calculateSumOfDigits(int n) {
		int sum =0;
		while(n>0) {
			int lastDigit = n%10;
			sum = sum+lastDigit;
			n = n/10;
			
		}
		System.out.println(sum);
	}
}
