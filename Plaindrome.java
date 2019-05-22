public class Plaindrome {
  public static void main(String [] args) {
	 Plaindrome drome = new Plaindrome();
	// System.out.println("Is a Plain drome   " + drome.isPlainDrome1("NO"));
	 System.out.println("Is a Plain drome   " + drome.isPlainDrome1("ABBA"));
  }
  
  
  private boolean isPlainDrome(String str) {
	  String reverse = "";
	  char [] strCharArr = str.toCharArray();
	  for(int i=0; i<strCharArr.length; i++) {
		  reverse = strCharArr[i] + reverse;
	  }
	  
	  char [] revArr = reverse.toCharArray();
	  
	  for(int i= 0; i<revArr.length; i++) {
		  for(int j =0; j<strCharArr.length; j++) {
			  j=i;
			 if( revArr[i] == strCharArr[j]) {
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
  
  
  private boolean isPlainDrome1(String str) {
	  char [] charArr = str.toCharArray();
	  String revString = "";
	  for (int i=0; i<charArr.length; i++) {
		  revString = charArr[i] + revString;
	  }
	  
	  char [] revCharArr = revString.toCharArray();
	  for (int i=0; i<charArr.length; i++) {
	  for(int j=0; j<revCharArr.length; j++) {
		  i=j;
		  if(charArr[i] ==revCharArr[j] ) {
			  break;
		  }
		  else {
			  return false;
		  }
		  
	  }
	
  }
	  return true;
  }
  
