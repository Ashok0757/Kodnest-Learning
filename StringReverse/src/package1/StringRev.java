package package1;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str =sc.nextLine();
		String arr1[]=str.split(" ");
		String revSen="";
		sc.close();
		for(int i=0;i<arr1.length;i++) {
			 String word =arr1[i];
			 String revWord="";
			for(int j=word.length()-1;j>=0;j--) {
				 revWord=revWord+word.charAt(j);
			 }
			revSen=revSen+revWord+" ";
		}
		System.out.println(revSen);
	}

}
