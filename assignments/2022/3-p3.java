import java.util.Scanner;
public class Assignment3_P3 {
/*
	Course : CPCS 202
	Name : Abdulrahman Mohammed Alaiwe Baharoon
	University ID : 2137222
	Section : F3
	Name of lab instructor : Ibrahim Alharbi
	Problem number : 3
	Problem title : Vehicular Restriction
	Assignment number : #3
	https://www.beecrowd.com.br/judge/en/profile/774802
	
*/

   static Scanner in = new Scanner(System.in);
	
   public static boolean isUpperCase(char c) {
		// the values of upper case letters ranges from 65 till 90;
		if (c > 90 || c < 65) {
		return false;
		}
		
		else 
		return true;
		
	}
	
   public static boolean isDigit(char c) {
		// the values of Characters 0 till 9 ranges from 48 till 57
		if (c > 57 || c < 48) { 
		return false;
		}
		
		else 
		return true;
		
	}
	
   public static boolean isValid(String carPlate) {
 	   	// the car plate consists of 8 characters
    	if (carPlate.length() != 8) { 
    	return false;
    	}
    	
    	// the forth character in the car plate should be "-"
    	// note that the value of - is 45
    	if (carPlate.charAt(3) != 45) { 
    	return false;
    	}
    	
    	
    	// this loop will go through the first 3 characters and check if they are upper or not
 	   for (int i = 0 ; i <= 2; i++) {
 		  
 		   if (isUpperCase(carPlate.charAt(i)) == false) 
 		   return false;   
 	   }
 	   
 	   // this loop will go through the last 4 characters and check if they are digits or not
 	  for (int j = 4; j <= 7; j++ ) {
 		  
 		if (isDigit(carPlate.charAt(j)) == false) 
 		return false; 	  
 	  }
 	   
 	   	
   return true;
 	      
   }
	
   public static void printDay(String carPlate) {
 		   
	   // here the last digit (as a character) is checked and based on it's value the day is printed 
	   // values ranging from 48 till 57 since these are the values of 0 till 9 as characters
	   
		   if (carPlate.charAt(7) == 49 || carPlate.charAt(7) == 50 ) {
			   System.out.println("MONDAY");
		   }
		   
		   else if (carPlate.charAt(7) == 51 || carPlate.charAt(7) == 52 ) {
			   System.out.println("TUESDAY");
		   }
		   
		   else if (carPlate.charAt(7) == 53 || carPlate.charAt(7) == 54 ) {
			   System.out.println("WEDNESDAY");
		   }
		   
		   else if (carPlate.charAt(7) == 55 || carPlate.charAt(7) == 56 ) {
			   System.out.println("THURSDAY");
		   }
		   
		   // note that the value of 0 as a character is 48
		   else if (carPlate.charAt(7) == 57 || carPlate.charAt(7) == 48 ) {
			   System.out.println("FRIDAY");
		   }
   }
	   
    
	public static void main(String[] args) {
		
		// n is the number of cases the program will check
		int n = in.nextInt();
		
		
		for (int i = 0; i<n; i++) {
			
		String carPlate = in.next();

		if (isValid(carPlate) == true) {
		printDay(carPlate);
		 
		}
		
		else 
		System.out.println("FAILURE");
		
		}
 
		
	}
	

}
