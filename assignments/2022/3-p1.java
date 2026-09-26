import java.util.Scanner;
/*

Course : CPCS 202
Name : Abdulrahman Mohammed Alaiwe Baharoon
University ID : 2137222
Section : F3
Name of lab instructor : Ebrahim Alharbi
Problem number : 1
Problem title : Middle Nephew
Assignment number : #3
https://www.beecrowd.com.br/judge/en/profile/774802

*/

/* How I got the solution: 
Huguinho is becomes the middle nephew when:
H Z L 
6 5 7	 H > Z and H < L
6 7 5	 H < Z and H > L

Zezinhois becomes the middle nephew when:
H Z L 
5 6 7	 Z > H && Z < L
7 6 5	 Z < H && Z > L

Luisinho is becomes the middle nephew when:
H Z L
5 7 6	 L < Z && L > H	
7 5 6	 L > Z && L < H
*/


 public class Problem_2 {
 
 	public static void printMiddle (int H, int Z, int L) {
 		
 		// probability that huguinho is the middle nephew 
		if ( (H > Z && H < L) || (H < Z && H > L) ) {
			System.out.println("huguinho");
		}
		
		// probability that zezinho is the middle nephew 
		else if ( (Z < H && Z > L) || (Z > H && Z < L) ) {
			System.out.println("zezinho");
		}
		
		// probability that luisinho is the middle nephew 
		else if ( (L < Z && L > H) || (L > Z && L < H) ) {
			System.out.println("luisinho");
		}
		
	}

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	int H = in.nextInt();			
	int Z = in.nextInt();
	int L = in.nextInt();

	printMiddle(H , Z, L);
		
	
	}

}
