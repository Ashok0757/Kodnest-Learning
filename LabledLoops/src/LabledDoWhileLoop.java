public class LabledDoWhileLoop {
    public static void main(String[] args) {
    	int j =1;
        Ashok: do {
           j++;
            System.out.println();
           int i=1;
            kumar: do {
                System.out.print("Ashok ");
                i++;
                break Ashok;
                
                } while (i<=5);
        } while (j<=5);
    }
}
