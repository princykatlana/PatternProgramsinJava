package PyramidPattern;

//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
//* * * * * * 
//* * * * * * *


public class SimpleSymbolPattern {
	
	
	private static void printSimplePattern(int rows) {
		
		for(int i=1; i<=rows; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print( "* ");
			}
			System.out.println("");
		}
		
		
	}
	
	public static void main(String[] args) {
		int rows= 7;
		printSimplePattern(rows);
	}

}
