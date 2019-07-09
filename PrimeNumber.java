public class PrimeNumber {

	public static void main(String[] args) {
		int number = 23;
		printPrimeNumber(number);

	}

	private static void printPrimeNumber(int number) {
		boolean isPrime = true;
		for(int index = number-1; index>1; index--) {
			if(number%index == 0) {
				isPrime = false;
				break;
			}
		}
		
		System.out.println(number + " Is a Prime Number " +  isPrime);
		
	}

}
