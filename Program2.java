package lab7;

public class Program2 {

	public static void main(String[] args) {
		 String str1 = "AbCdefGHijklMNOpqRstUVwxyZ@%*234";
	      int upperCase = 0;
	      int lowerCase = 0;
	      char[] ch = str1.toCharArray();
	      for(char chh : ch) {
	         if(chh >='A' && chh <='Z') {
	            upperCase++;
	         } else if (chh >= 'a' && chh <= 'z') {
	            lowerCase++;
	         } else {
	            continue;
	         }
	      }
	      System.out.println("Count of Uppercase letters are" + upperCase + " and of Lowercase letters are " + lowerCase);
	}

}
