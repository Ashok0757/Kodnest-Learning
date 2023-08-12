import java.util.Scanner;
public class StringJoiner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a String:");
		String str1 = sc.nextLine();
		System.out.print("Enter another String:");
		String str2 = sc.nextLine();
		sc.close();
		System.out.println(joinStrings(str1,str2));
		}
	public static String joinStrings(String str1, String str2) {
		return  str1 + str2 ;
	}
}
