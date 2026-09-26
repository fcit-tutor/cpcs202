
import java.util.Scanner;

public class Q6_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int shirt = 66; //sum of all shirts

        System.out.print("Enter a numbers of the T-shirts: ");

        for (int i = 0; i < 10; i++) {
            shirt -= input.nextInt();
        }
        System.out.println("The shirt is " + shirt);
    }

}
