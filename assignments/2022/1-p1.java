import java.io.IOException;
import java.util.Scanner;

/*
 
Course : CPCS 202
Name : Abdulrahman Mohammed Alaiwe Baharoon
University ID : 2137222
Section : F3
Name of lab instructor : Abdullah Alharbi
Problem number : 1
Problem title : Salary Increase
Assignment number : #1
Beecrowd id : 774802

*/

public class Problem_1 {
 
    public static void main(String[] args) throws IOException {
    	Scanner input = new Scanner(System.in);
    	float salary, moneyEarned, newSalary;
    	   
    	salary = input.nextFloat();
    	
    	if (salary <= 400.00 && salary >= 0) {
    		moneyEarned = (float) (0.15 * salary);
    		newSalary = moneyEarned + salary;
    		System.out.printf("Novo salario: %.2f", newSalary);
    		System.out.println();
    		System.out.printf("Reajuste ganho: %.2f", moneyEarned);
    		System.out.println();
    		System.out.println("Em percentual: 15 %");

    	}
    	
    	else if (salary >= 400.01 && salary <= 800.00) {
    		moneyEarned = (float) 0.12 * salary;
    		newSalary = moneyEarned + salary;
    		System.out.printf("Novo salario: %.2f", newSalary);
    		System.out.println();
    		System.out.printf("Reajuste ganho: %.2f", moneyEarned);
    		System.out.println();
    		System.out.println("Em percentual: 12 %");

    	}
    		
    	else if (salary >= 800.01 && salary <= 1200.00) {
    		moneyEarned = (float) 0.10 * salary;
    		newSalary = moneyEarned + salary;
    		System.out.printf("Novo salario: %.2f", newSalary);
    		System.out.println();
    		System.out.printf("Reajuste ganho: %.2f", moneyEarned);
    		System.out.println();
    		System.out.println("Em percentual: 10 %");
    		
    	}

    	else if (salary >= 1200.01 && salary <= 2000.00) {
    		moneyEarned = (float) 0.07 * salary;
    		newSalary = moneyEarned + salary;
    		System.out.printf("Novo salario: %.2f", newSalary);
    		System.out.println();
    		System.out.printf("Reajuste ganho: %.2f", moneyEarned);
    		System.out.println();
    		System.out.println("Em percentual: 7 %");
    		
    	}
    	
    	
    	else if (salary > 2000.00) {
    		moneyEarned = (float) 0.04 * salary;
    		newSalary = moneyEarned + salary;
    		System.out.printf("Novo salario: %.2f", newSalary);
    		System.out.println();
    		System.out.printf("Reajuste ganho: %.2f", moneyEarned);
    		System.out.println();
    		System.out.println("Em percentual: 4 %");

    	}


    	else {
    		
    		System.out.println("Invalid input.");
    	}
    	

    }
 
}