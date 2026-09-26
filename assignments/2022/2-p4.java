import java.util.Scanner;
public class Problem_4 {
/*
Course : CPCS 202
Name : Abdulrahman Mohammed Alaiwe Baharoon
University ID : 2137222
Section : F3
Name of lab instructor : Ibrahim Alharbi
Problem number : 4
Problem title : Internship
Assignment number : #2
Beecrowd id : 774802
*/
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()) {
			
			int M = in.nextInt();
			double sigmaGradeByWorkLoad = 0;
			double sigmaWorkLoad = 0;
			double API;
			
			for (int i =  0; i < M; i++) {
			
				int n, c;
				n = in.nextInt();
				c = in.nextInt();
				
				sigmaGradeByWorkLoad += n * c;
				sigmaWorkLoad += c;
				
			}
			
			sigmaWorkLoad *= 100;
			API = sigmaGradeByWorkLoad / sigmaWorkLoad;
			System.out.printf("%.4f", API);
			System.out.println();
			
		}

	}

}
