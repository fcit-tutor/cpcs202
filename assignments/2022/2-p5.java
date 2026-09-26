import java.util.Scanner;
/*
Course : CPCS 202
Name : Abdulrahman Mohammed Alaiwe Baharoon
University ID : 2137222
Section : F3
Name of lab instructor : Ibrahim Alharbi
Problem number : 5
Problem title : Primary Arithmetic
Assignment number : #2
Beecrowd id : 774802
*/
public class Problem_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			
			//  if both numbers are zero the entire program shuts down. 
			if (num1 == 0 && num2 == 0) {
				break;
			}
			
			// a variable to count the carried operations.
			int carryOperation = 0;
			// a variable to save the carried number for calculations.
			int carry = 0;
			
			// if any number isn't zero program starts immediately.
			while (num1 != 0 || num2 != 0) {
				
				// number % 10 we extract the last digit of a number. 
				// since we are beginning to to sum the last two digits carry operation will be zero.
				int sum = carry + num1 % 10 + num2 % 10;
				
				// if the sum of last two digits of is more than 9 we will have a carry operation.
				if (sum >= 10) {
					 carryOperation++;
				}
				
				// notice all variables are int so when there is no carry operation.
				// the program won't be affected since we only count integers by floating points.
				carry = sum / 10;
				
				// eliminate the first two numbers we did operations on.
				num1 /= 10;
				num2 /= 10;
			}
			
			// last thing is printing the carry Operation total number.
			
			if (carryOperation == 0) {
				System.out.println("No carry operation.");
			}
			
			// since it is only one, meaning I will have to write operation not operations.
			// it becomes a single case itself.
			else if (carryOperation == 1) {
				System.out.println("1 carry operation.");

			}
			
			else { 
				System.out.println(carryOperation + " carry operations.");
			}
		
		}
		
			
	}
}