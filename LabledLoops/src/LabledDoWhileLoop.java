
public class LabledDoWhileLoop {

	public static void main(String[] args) {
	
		int j=1;
		Kumar:do {
		int i=1;
	Ashok: do {
		System.out.print("Ashok");
		i++;
		break Ashok;
	}while(i<=5);
	j++;
	System.out.println();
	}while(j<=5);

}
}
