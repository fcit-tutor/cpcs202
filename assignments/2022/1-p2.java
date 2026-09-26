import java.io.IOException;
import java.util.Scanner;

/*

Course : CPCS 202
Name : Abdulrahman Mohammed Alaiwe Baharoon
University ID : 2137222
Section : F3
Name of lab instructor : Abdullah Alharbi
Problem number : 2
Problem title : Consumption
Assignment number : #1
Beecrowd id : 774802

*/

public class Problem_2 {
 
    public static void main(String[] args) throws IOException {
    
        Scanner input = new Scanner(System.in); 
        
        // fuel is in liter and distance is in kilo metres
        
        int distance;
        double spentFuel, avgKmperLiter;
        
        distance = input.nextInt();
        spentFuel = input.nextDouble();
        
        avgKmperLiter = distance / spentFuel;
        
        System.out.printf("%.3f", avgKmperLiter);
        System.out.println(" km/l");
        
        
    }
 
}