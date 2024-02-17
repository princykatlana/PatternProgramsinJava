package PyramidPattern;

// Simple pattern
//1  
//1 2  
//1 2 3  
//1 2 3 4  
//1 2 3 4 5  

public class SimplePattern {
	
	
	private static void printSimplePattern(int rows) {
		
		for(int i=1; i<=rows; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print( j + " ");
			}
			System.out.println("");
		}
		
		
	}
	
	public static void main(String[] args) {
		int rows= 7;
		printSimplePattern(rows);
	}

}
