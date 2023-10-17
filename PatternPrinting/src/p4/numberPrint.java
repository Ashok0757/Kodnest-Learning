package p4;

public class numberPrint {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) { 
			for (int k=8;k>=i;k--)
		 	{
			System.out.print(" ");
			}
		
			for(int j=1;j<=i;j++)
			{
		
			System.out.print(i);
			}
			
		
			System.out.println();
		}
		for(int i=8;i>=1;i--) { 
			for (int k=8;k>=i;k--)
		 	{
			System.out.print(" ");
			}
		
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			
			
		}
			System.out.println();
		}
	}
}




