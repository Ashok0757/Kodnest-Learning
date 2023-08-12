import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		swapUsingBitwise();
		}
	public static void swapUsingBitwise() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Integer:");
		int first = sc.nextInt();
		System.out.print("Enter the second Integer:");
		int second = sc.nextInt();
		sc.close();
		int sum = first + second;
		second = sum - second;
		first = sum - first;
		System.out.println("first = "+first+ ","+" second = "+second);
		}
	}
