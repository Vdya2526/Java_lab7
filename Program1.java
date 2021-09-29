package lab7;

public class Program1 {
	

	public static void main(String[] args) {
		  
		String str[] = { "ciaz", "alto", "swift", "dezire", "brezza"};
	      String temp;
	      System.out.println("Sorted string...");
	      for (int j = 0; j < str.length; j++) {
	         for (int i = j + 1; i < str.length; i++) {
	            // comparing strings
	            if (str[i].compareTo(str[j]) < 0) {
	               temp = str[j];
	               str[j] = str[i];
	               str[i] = temp;
	            }
	         }
	         System.out.println(str[j]);
	      }
	}

}
