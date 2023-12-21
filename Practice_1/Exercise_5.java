package Practice_1;
import java.math.BigInteger;
import java.util.Scanner;
public class Exercise_5 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        Scanner inFromUser = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = inFromUser.nextInt();
        BigInteger fact = computeFactorial(n);
        System.out.print("\nFactorial = " + fact);
        System.out.print("\nLength of the number = " + fact.toString().length());
        System.out.print("\nProgram execution time = " + ((System.currentTimeMillis() - time)/1000));

    }
    public static BigInteger computeFactorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <=n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}

