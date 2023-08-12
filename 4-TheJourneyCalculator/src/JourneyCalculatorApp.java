import java.util.Scanner;

public class JourneyCalculatorApp{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Speed:");
		double speed =sc.nextDouble();
		System.out.print("Enter the time:");
		double time = sc.nextDouble();
		sc.close();
		JourneyCalculator j = new JourneyCalculator();
		System.out.println(j.calculateDistance( speed, time));
		
		
	}

}



