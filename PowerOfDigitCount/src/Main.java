import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		sc.close();
		power p = new power();
		int n=p.count(num);
		System.out.println("result of "+num+" if the power is "+n+": "+ p.powerToN(num,n));
		}
	}
