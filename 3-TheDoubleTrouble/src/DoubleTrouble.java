import java.util.Scanner;
public class DoubleTrouble {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number:");
	int num = sc.nextInt();
	sc.close();
	System.out.println(doubleTheNumber(num));
		}
public static int doubleTheNumber(int num) {
	return num*2;
	}
}