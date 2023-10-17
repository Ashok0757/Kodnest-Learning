import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an Integer:");
		int n = sc.nextInt();
		sc.close();
		calculateSum(n);
		}
	public static void calculateSum(int n) {
		int sum=0;
		for(int i=0; i<= n; i++){
			sum=sum+i;
			}
		System.out.println(sum);	
		}
	}
