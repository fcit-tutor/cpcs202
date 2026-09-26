/*
 * NAME: L...#
*/


import java.util.Scanner;

public class Q6_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] found = new int[10];
        System.out.print("Enter a numbers of the T-shirts: ");
        for (int i = 0; i < 10; i++) {
            found[i] = in.nextInt();
        }
        for (int i = 1; i <= 11; i++) {
            boolean forgot = true;
            for (int j = 0; j < 10; j++) {
                if (i == found[j]) {
                    forgot = false;
                    break;
                }
            }
            if (forgot) {
                 System.out.println("The shirt is " + i);
                break;
            }
        }
    }
}
