
public class EquilateralTrianglePattern {

	public static void main(String[] args) {
	for(int i=0;i<=2;i++) {
		for(int j=0;j<=2;j++) {
		if(i==0&&j==1 || i==2&&j==0 || i==2&&j==1 ||i==2&&j==2) {
			System.out.print("* ");
		} 
		else {
			System.out.print("  ");
		}
		}
		System.out.println();
	}
	}

}
