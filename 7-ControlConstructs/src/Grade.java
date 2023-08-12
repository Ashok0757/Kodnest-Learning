import java.util.Scanner;

public class Grade {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your marks:");
	float marks = sc.nextFloat();
	sc.close();
	Score s = new Score();
	s.GradeCheck(marks);
		
	}
}
class Score {
void GradeCheck(float marks){

		if(marks >= 90) {
			System.out.println("A+ grade");
		}
		else if (marks >= 80 && marks < 90) {
			System.out.println(" A-grade");
		}
		else if (marks >= 70 && marks < 80) {
			System.out.println("B-Grade");
		}
		else if (marks >= 60 && marks < 70) {
			System.out.println("C-Grade");
		}
		else if (marks >=50 && marks < 60) {
			System.out.println("D-Grade");
		}
		else {
			System.out.println("Fail...");
		}
	}

}



