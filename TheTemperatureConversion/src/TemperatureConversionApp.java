import java.util.Scanner;

public class TemperatureConversionApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option:");
		System.out.println("1. Convert Celsius to Fahrenheit");
		System.out.println("2. Convert Fahrenheit to Celsius");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice:");
		int a = sc.nextInt();
		System.out.print("Enter the temperature value:");
		double temp =sc.nextDouble();
		sc.close();
		if(a == 1) {
			double result = celsiusToFahrenheit(temp);
			System.out.println(temp+"°C is equivalent to "+result+"°F");
		}
		else {
			double result = fahrenheitToCelsius(temp);
			System.out.println(temp+"°F is equivalent to "+result+"°C");
			}
}
	public static double celsiusToFahrenheit(double temp){
	double result = (temp * 9/5) + 32;
		return result;
	}
	public static double fahrenheitToCelsius(double temp){
		double result = (temp - 32)*5/9 ; 
		return result;
	}

}
