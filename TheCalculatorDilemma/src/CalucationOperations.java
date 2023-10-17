import java.util.Scanner;

public class CalucationOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		double num1 =sc.nextDouble();
		System.out.println("Enter another number:");
        double num2 = sc.nextDouble();
        System.out.println("Enter the operation to perform(eg: + , - , / , * , %):");
        String a = sc.next();
        char operator = a.charAt(0); // conversion of 'String' to 'Char'
        sc.close();
        operations(operator, num1 , num2);
	}
        public static void operations(char operator, double num1 , double num2) {
        	switch (operator) {
            case '+':
              double  result =  num1 + num2;
                System.out.println(num1+" "+operator+" "+ num2+ " = "+ result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1+" "+operator+" "+ num2+ " = "+ result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1+" "+operator+" "+ num2+ " = "+ result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1+" "+operator+" "+ num2+ " = "+ result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
            	result = num1 % num2;
            	System.out.println(num1+" "+operator+" "+ num2+ " = "+ result);
            	break;
            	default:
                System.out.println("Error: Invalid operator.");
                break;
        }    
    }
}

    
        

        

