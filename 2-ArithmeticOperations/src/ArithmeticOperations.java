import java.util.Scanner;
public class ArithmeticOperations {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a number:");
	  int num1 = sc.nextInt();
	  System.out.print("Enter another number:");
	  int num2 = sc.nextInt();
	  System.out.println(subtractNumbers(num1,num2));
	  System.out.print("Enter a number:");
	   num1 = sc.nextInt();
	  System.out.print("Enter another number:");
	   num2 = sc.nextInt();
	  System.out.println(multiplyNumbers(num1,num2));
	  System.out.print("Enter a number:");
	   num1 = sc.nextInt();
	  System.out.print("Enter another number:");
	   num2 = sc.nextInt();
	  System.out.println(divideNumbers(num1,num2));
	  System.out.print("Enter a number:");
	   num1 = sc.nextInt();
	  System.out.print("Enter another number:");
	   num2 = sc.nextInt();
	  System.out.println(findRemainder(num1,num2));
	  sc.close();
   }
  public static int subtractNumbers(int num1, int num2) {
	  return num2-num1;
	  }
  public static int multiplyNumbers(int num1, int num2) {
	  return num1*num2;
	  }
  public static double divideNumbers(int num1, int num2) {
	  return num1/num2;
	  }
  public static int findRemainder(int num1, int num2) {
	  return num1%num2;
	  
  }

}
