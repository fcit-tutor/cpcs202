import java.io.IOException;
import java.util.Scanner;

/*

Course : CPCS 202
Name : Abdulrahman Mohammed Alaiwe Baharoon
University ID : 2137222
Section : F3
Name of lab instructor : Abdullah Alharbi
Problem number : 3
Problem title : Welcome to the Winter!
Assignment number : #1
Beecrowd id : 774802

*/

public class Problem_3 {
 
    public static void main(String[] args) throws IOException {
 
      Scanner input = new Scanner(System.in);

		int A, B, C;
 		
		
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		
		
	if (A > B && C >= B) {
		System.out.println(":)");
	}
	
	// but decreased or remind constant from b to c
	else if (A < B && B >= C) {
		System.out.println(":(");
	}
	
		
	else if (A < B && C > B && ( (C-B) < (B-A) ) ) {
		System.out.println(":(");	
	}
	
	// at least 
	else if (A < B && C > B && ( (C-B) >= (B-A) ) ) {
		System.out.println(":)");
	}
	
		
	else if (A > B && B > C && ( (B-C)<(A-B) ) ) {
		System.out.println(":)");
	}
		
	
	else if (A > B && C < B && (B-C) >= (A-B)  ) {
		System.out.println(":(");	
		
	}

	else if (A == B && C > B) {
		System.out.println(":)");
	}
	
	else 
		System.out.println(":(");	
 
    }
 
}