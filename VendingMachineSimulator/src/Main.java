import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the code;");
		String productCode = sc.next();
		sc.close();
		getProduct(productCode);
		}
	public static void getProduct(String productCode) {
		switch(productCode) {
		case("P01"):System.out.println("Coca cola");
		break;
		case("P02"):System.out.println("Cocacola");
		break;
		case("P03"):System.out.println("Pepsi");
		break;
		case("P04"):System.out.println(",Fanta");
		break;
		case("P05"):System.out.println(",JalJeera");
		break;
		case("P06"):System.out.println("MountainDew");
		break;
		default:System.out.println("BoatGuava");
		}
	}
	}
