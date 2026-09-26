
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String userName1 = input.next();
        String userName2 = input.next();

        
        System.out.println("First letter: " + userName1.charAt(0));
        System.out.println("Second letter: " + userName2.charAt(0));
    }
    
}
