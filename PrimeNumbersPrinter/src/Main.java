import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the terms:");
		int n = sc.nextInt();
		sc.close();
		printPrimes(n);
	}
	public static boolean primeCheck(int num) {
		if (num <= 1) {
			return false;
		}
		 for(int i=2;i<num; i++) {
			if( num%i==0 )
			{
				return false;
				}
			}
		 return true;
				}
			public static void printPrimes(int n) {
			    int count =1;
				int num =1;
				while (count<=n) {
					boolean a = primeCheck(num);
					if(a) {
						System.out.print(num+" ");
						count++;
					}
					num++;
				}
				}
	
}


	


