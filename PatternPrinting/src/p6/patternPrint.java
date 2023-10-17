package p6;

import java.util.Scanner;

public class patternPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		sc.close();
		Newclass1.pattern1(n);
		System.out.println("=============================");
		NewClass2.pattern2(n);
		System.out.println("=============================");
		NewClass3.pattern3(n);
		System.out.println("=============================");
		NewClass4.pattern4(n);
		System.out.println("=============================");
		NewClass5.pattern5(n);
		System.out.println("=============================");
		NewClass6.pattern6(n);
		System.out.println("=============================");
		NewClass7.pattern7(n);
		System.out.println("=============================");
		NewClass8.pattern8(n);
		System.out.println("=============================");
		NewClass9.pattern9(n);
		System.out.println("=============================");
		NewClass10.pattern10(n);
		System.out.println("=============================");
		NewClass11.pattern11(n);
	}
	}
class Newclass1{
	public static void pattern1(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0||j==0) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}


			}System.out.println();
		}
	}
}
class NewClass2{
 	public static void pattern2(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==n||j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}

			}System.out.println();
		}
		
	}
}
class NewClass3{
	public static void pattern3(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==n/2||j==n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}

			}System.out.println();
		}
	}
}

class NewClass4{
	public static void pattern4(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==n/2||j==0||j==n||i==0||i==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
}
class NewClass5{
	public static void pattern5(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==n/2||j==0||j==n||i==0||i==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
}
class NewClass6{
	public static void pattern6(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0||j==n||i==0||i==n||i==n-(i-1)||j==n-(j-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
}
class NewClass7{
	public static void pattern7(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==n||j==0||j==0||i==n/2||i==0) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
}
class NewClass8{
	public static void pattern8(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0||i==n||i==0) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
}
class NewClass9{
	public static void pattern9(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0||i==n||i==0||i==n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
}
class NewClass10{
	public static void pattern10(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0||i==0||i==n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
}
class NewClass11{
	public static void pattern11(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0||i==0||i==n||j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
}
	

	

