package sumofreverseddigits_21.pkg5;

import java.util.Scanner;

public class SumOfReversedDigits_215 {

    static int reverseRange(int a, int b) {
        int sum = 0;

        if (a / 10 > 0) {

            for (int i = a; i <= b; i++) {
                int tempA1 = i / 10;
                int tempA2 = i % 10;

                sum += tempA1 + tempA2;

            }

        } else {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Tcases = input.nextInt();

        for (int i = 0; i < Tcases; i++) {
            System.out.print("Left: ");
            int x = input.nextInt();
            System.out.print("Right: ");
            int y = input.nextInt();
            System.out.print("result: ");
            System.out.println(reverseRange(x, y));
        }

    }

}
