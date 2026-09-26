import java.util.Scanner;
/*
	Course : CPCS 202
	Name : Abdulrahman Mohammed Alaiwe Baharoon
	University ID : 2137222
	Section : F3
	Name of lab instructor : Ibrahim Alharbi
	Problem number : 3
	Problem title : Playing Darts by Distance
	Assignment number : #3
	https://www.beecrowd.com.br/judge/en/profile/774802
	
*/

public class Problem_2 {
	 
	static Scanner in = new Scanner(System.in);

	// as per rules score for 1 try is the x * d
	// this method asks for x and d 
	// calculates score = x * d
	// repeats the process 3 times while also summing the previous score
	// finally returns the final score which is the summation of 3 tries.
	public static int getScore() {
		
		int score = 0;
		int X;
		int D;
		
		for (int j = 1; j <=3; j++ ) {
			X = in.nextInt();
			D = in.nextInt();
			score += X * D;
		}
		
		return score; 
		
	}
	 
	public static void main(String[] args) {
		
		// n is the number of test cases the program will run.
		 int n = in.nextInt();
		 
		 for (int i = 0; i<n; i++) {
			 
			int joaoScore = getScore();
			int mariaScore = getScore();
				
			if (joaoScore < mariaScore) {
				System.out.println("MARIA");
			}
			
			else if (joaoScore > mariaScore) {
				System.out.println("JOAO");
			}
			
		 }
		
		
			
			
		}	
	}
 

// Alternative solution without methods (commented out).
// import java.util.Scanner;
// public class Problem_2withoutMethods {
// 	static Scanner in = new Scanner(System.in);
// 	
// 	// Another approach to solve P2.
// 	// I solved problem 2 earlier without planning the methods later on I regeret that,
// 	// since I couldn't find a way to create a method to meet the assignment requests.
// 	// I had to solve the problem again from scratch again.
// 	// conclusion: never solve a problem without planning the methods first.
// 	
// 	/*
// 	Course : CPCS 202
// 	Name : Abdulrahman Mohammed Alaiwe Baharoon
// 	University ID : 2137222
// 	Section : F3
// 	Name of lab instructor : Ibrahim Alharbi
// 	Problem number : 2
// 	Problem title : Playing Darts by Distance
// 	Assignment number : #3
// 	https://www.beecrowd.com.br/judge/en/profile/774802	
// 	*/
//  
// 	
// 	public static void main(String[] args) {
//  	
// 	
// 	// n is the number of games
// 	int n = in.nextInt();
// 	
// 	// this loop is for the number of games
// 	for (int j = 0; j<n; j++) {
// 		
// 		// the score variables are initialized here and not outside since score is not continuous with previous games
// 		// meaning after every game the score resets to 0
// 		int joaoScore = 0;
// 		int mariaScore = 0;
// 	
// 		// here is a single game program, each game has 3 shots for joao and 3 shots for maria
// 		for (int i = 0; i<6; i++) {
// 			
// 			// x is the score by distance between the dart and the center of the target
// 			// d is the distance between the shooter and the target
// 			int X = in.nextInt();
// 			int D = in.nextInt();
// 		
// 			// first 3 shots we take results of joao
// 			if (i < 3) {
// 			// we calculate his score here following the rules given x*d in the question
// 			joaoScore += X * D;
// 			}
// 			
// 			// rest shots are marias shots
// 			else {
// 			// we calculate her score here following the rules given x*d in the question
// 			mariaScore += X * D;
// 			}
// 		
// 		}
// 		
// 		if (mariaScore > joaoScore) {
// 			System.out.println("MARIA");	
// 		}
// 		else if (mariaScore < joaoScore) {
// 			System.out.println("JOAO");
// 		}
// 		
// 		
// 		
// 	}	
// 		
// }
//  }
// 
// 