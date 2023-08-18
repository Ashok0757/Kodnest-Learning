import java.util.Scanner;
public class Main {
	public static void checkGrade(int grade) {
		if(grade>50)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your marks:");
		int grade = sc.nextInt();
		sc.close();
		checkGrade(grade);
		}
}
