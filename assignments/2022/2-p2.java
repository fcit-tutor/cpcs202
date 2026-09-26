import java.io.IOException;
 /*
Course : CPCS 202
Name : Abdulrahman Mohammed Alaiwe Baharoon
University ID : 2137222
Section : F3
Name of lab instructor : Ibrahim Alharbi
Problem number : 2
Problem title : Sequence IJ 3
Assignment number : #2
Beecrowd id : 774802
*/
public class Problem_2 {
 
 	public static void main(String[] args) {
        
		int j = 7;
		for (int i = 1; i <= 9; i++) {
			
			System.out.println("I=" + i + " J=" + j);
			System.out.println("I=" + i + " J=" + (j-1) );
			System.out.println("I=" + i + " J=" + (j-2) );
			i++;
			j += 2;
			
		}
		
		
	}

}
