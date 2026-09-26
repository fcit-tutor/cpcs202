import java.util.Scanner;
public class Problem_3 {

/*
 
Course : CPCS 202
Name : Abdulrahman Mohammed Alaiwe Baharoon
University ID : 2137222
Section : F3
Name of lab instructor : Ibrahim Alharbi
Problem number : 3
Problem title : Sum of Consecutive Odd Numbers II
Assignment number : #2
Beecrowd id : 774802

*/

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in); 

				// the first loop is to iterate how many times the user wants the program to run.
				int testCases = in.nextInt();
				for (int j = 1; j <= testCases; j++) {

					// since my inner loop will start from the smallest number between x and y
					// and then add all odd numbers between x and y 
					// I have to swap variable in case:
					// the user didn't insert inputs in a decreasing order.
					
					int x, y, temp;
					int total = 0;

					x = in.nextInt();
					y = in.nextInt();
					
					 
					if (x > y) {

					temp = y;
					y = x;
					x = temp;
					}
					
					// the problem doesn't include x and y in the summation of odd numbers between them
					// so I increment x so that the value of x doesn't count 
					x++;
					
					// since y is also not included I stop the loop before it counts y using < 
					while (x < y) {
						
						// checking if the number is odd or not:
						if (x % 2 != 0) {
						total += x;
						// total variable job is to save odd values and sum them as the loop goes on.
						
						}
					// increment x to go to the next number and check (keeping the loop going on until x < y
					// you could use a for loop instead of while like this: "for (x; x<y; x++)"
					// and you wouldn't need to do this step but I choose while loop
					x++;
					

					 
					}
					// printing the sum of all odd numbers between x and y
					// note the printing is outside the inner loop but Inside the bigger one!
				
					System.out.println(total);

				}
			 
				
			}

		
		
	}


