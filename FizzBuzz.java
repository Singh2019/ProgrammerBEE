public class FizzBuzz {
	
	public static void main(String [] args) {
		int number = 25;
		
		String result = printFizzBuzz( number);
		System.out.println(result);
	}
// fuction prints fizz buzz
	private static String printFizzBuzz(Integer number) {
		String result = "";
		if(number%3 ==0) {
			result = result + "Fizz";
		}
		if(number%5 ==0) {
			result = result + "Buzz";
		}
		if(result.equals("")){
			result = number.toString();
		}
		 return result;
		
	}

}
