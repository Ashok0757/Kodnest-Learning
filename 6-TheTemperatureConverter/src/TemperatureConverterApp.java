import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in fahrenheit:");
		double  fahrenheit = sc.nextDouble();
		sc.close();
		TemperatureConverter t = new TemperatureConverter ();
		System.out.println(t.convertFahrenheitToCelsius( fahrenheit));

	}

}
