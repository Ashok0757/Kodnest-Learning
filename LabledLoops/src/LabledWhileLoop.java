
public class LabledWhileLoop {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i =1;
		Ashok:while(i<=5) {
			int j=1;
			Yadav:while(j<=5) {
				System.out.print("Ashok");
				j++;
				break Ashok;
				
			}
			System.out.println();
			i++;
		}
	}

}
