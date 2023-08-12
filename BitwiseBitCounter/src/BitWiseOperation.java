import java.util.Scanner;

public class BitWiseOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer:");
		int num = sc.nextInt();
		sc.close();
		int count = countSetBits(num);
		System.out.println(count);
		}
	public static int countSetBits(int num) {
		int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
		}
        return count;
        }
	}
