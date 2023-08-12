package com.ControlConstructsLooping;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.print("Enter a number between 1-6:");
	int num = Sc.nextInt();
	Sc.close();
	switch(num){
	case 0:
		System.out.println("Sunday");
		break;
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thrusday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	default:
		System.out.println("Idiot..Enter the given range of number....");
		}
	}
}
