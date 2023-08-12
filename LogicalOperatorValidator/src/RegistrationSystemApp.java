import java.util.Scanner;

public class RegistrationSystemApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Is input valid (true/false): ");
		boolean a = sc.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false): ");
		boolean b = sc.nextBoolean();
		sc.close();
		boolean result = isValidInput(a,b);
		if(result) {
		System.out.println("Input is valid.");
		}
		else {
			System.out.println("Input is invalid");
		}	
	}
	public static boolean isValidInput(boolean a , boolean b) {
		boolean result = a && b ;
	return result;
	}
}
