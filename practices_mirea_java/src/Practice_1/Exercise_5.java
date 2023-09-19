package Practice_1;
import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner inFromUser = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = inFromUser.nextInt();

        int fact = computeFactorial(n);
        System.out.printf("Factorial = %d", fact);
    }
    public static int computeFactorial(int n) {
        if (n < 0) {
            return -1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

