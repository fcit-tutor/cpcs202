import java.util.Scanner;
public class Problem_1 {
	
	/*
	Course : CPCS 202
	Name : Abdulrahman Mohammed Alaiwe Baharoon
	University ID : 2137222
	Section : F3
	Name of lab instructor : Ibrahim Alharbi
	Problem number : 1
	Problem title : Experiments
	Assignment number : #2
	Beecrowd id : 774802
	*/
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
			 // first input = number of experiements expNum
			 // then based on expNum we loop the question of animal type and its num
			 // if statments inside the loop to count each animal and its number per loop
			 // printing the total number of animals
			 // printing each animal and it's number separately

			 double animalNum, coelho, rato, sapo;
			 char animalType;
			 int count = 0;
			 coelho = 0; 
			 sapo = 0; 
			 rato= 0;
			 double animalTotal = 0;

			 int expNum = in.nextInt();

			 while (count < expNum)
			 {
			  animalNum = in.nextDouble();
			  animalType = in.next().charAt(0);
			  

			  if (animalType == 'C')
			  {
			   coelho += animalNum;
			  }

			  else if (animalType == 'R')
			  {
			   rato += animalNum;
			  }

			  else if (animalType == 'S')
			  {
			   sapo += animalNum;
			  }

			  count++;
			  animalTotal = sapo + rato + coelho;

			  
			 }
			 
			 if (expNum == 0 ) {
				 System.out.println("Total: " + (int)animalTotal + " cobaias");
				 System.out.println("Total de coelhos: " + (int)coelho);
				 System.out.println("Total de ratos: " + (int) rato);
				 System.out.println("Total de sapos: " + (int)sapo);
				 System.out.println("Percentual de coelhos: % " + 0);
				 System.out.println("Percentual de ratos: % " + 0);
				 System.out.println("Percentual de sapos: % " + 0);

			 }
			 
			 else {
			 System.out.println("Total: " + (int)animalTotal + " cobaias");
			 System.out.println("Total de coelhos: " + (int)coelho);
			 System.out.println("Total de ratos: " + (int) rato);
			 System.out.println("Total de sapos: " + (int)sapo);
			 System.out.printf("Percentual de coelhos: %.2f %%\n", coelho/animalTotal * 100);
			 System.out.printf("Percentual de ratos: %.2f %%\n", rato/animalTotal * 100);
			 System.out.printf("Percentual de sapos: %.2f %%\n", sapo/animalTotal * 100);
			 }

			}
			
	}


 
