import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		char arr1[]=str.toCharArray();
		char arr2[]=new char[arr1.length];
		sc.close();
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==' ') {
				arr2[i]=arr1[i];
			}
		}
		int j=arr2.length-1;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=' ') {
				if(arr2[i]==' ') {
					j--;
				}
				}
			arr2[j]=arr1[i];
			j--;
		}
		str =new String(arr2);
		System.out.println(str);
	}
}
