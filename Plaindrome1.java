/**
 * how it works -
 * First element of string is compared with last element of string, then 2nd element to second last element.
 * If string have odd length then mid charater is picked from both end and compared with itself.
 * But once comparision is made from both side its clear that its a plaindrome, but loop go further from mid point and extra work is done.
 * Its solution,with  more time complexity.
 * */
public class Plaindrome1 {
	 public static void main(String [] args) {
		 Plaindrome1 drome = new Plaindrome1();
		 System.out.println("Is a Plain drome   " + drome.isPlainDrome("NO"));
		 System.out.println("Is a Plain drome   " + drome.isPlainDrome("12321"));
	  }
	  
	  
	  private boolean isPlainDrome(String str) {
		  
		  char [] strCharArr = str.toCharArray();

		  for(int i= 0; i<strCharArr.length; i++) {
			  for(int j =strCharArr.length-1; j>=0; j--) {// run until j>=0
				 j= (strCharArr.length-1)-i;       //decide j depending upon arraylength.
				 if( strCharArr[i] == strCharArr[j]) {
					 break;

				 }
				 else
				 {
					 return false;
				 }
			  }
		  }
			  
		  return true;
	  }
}
