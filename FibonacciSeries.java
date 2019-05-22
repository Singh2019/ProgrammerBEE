public class FibonacciSeries {
	
	public static void main( String [] args) {
		
		printFibonacchiSeries(20);
	}

	private static void printFibonacchiSeries(int range) {
		int num1 =0;
		int num2 = 1;
		int sum = 0;
	System.out.print(num1 +"  ");
	System.out.print(num2 +"  ");
		for (int i=1; i<range; i++) {
			sum = num1 + num2;
			System.out.print(sum +"  ");
			
			num1 = num2;
			num2 = sum;
			  
		}
	}
}
