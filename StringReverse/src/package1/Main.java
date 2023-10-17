package package1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		String arr[]=str.split(" ");
		String a="";
		for(int i=arr.length-1;i>=0;i--) 
		{
		 a=a+arr[i]+" ";	
		}
		System.out.println(a);
		
		}
		}

