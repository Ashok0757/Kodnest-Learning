package powerToDigits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		sc.close();
		Power power = new Power();
		power.digitToPower(num);

	}

}
 class Power{
	void digitToPower(int num) {
		int result = 1;
		
	}
}