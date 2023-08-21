import java.util.Scanner;
public class GalacticArthmetic {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a number:");
	  long num1 = sc.nextLong();
	 System.out.print("Enter another number:");
	  long num2 = sc.nextLong();
	  sc.close();
	  System.out.println(galacticAddition(num1,num2));
	  }
	public static long galacticAddition(long num1, long num2) {
	  return num1 + num2;
	}
}
