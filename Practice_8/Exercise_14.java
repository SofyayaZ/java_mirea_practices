package Practice_8;

public class Exercise_14 {
    public static void main(String[] args) {
        int n = 25873269;

        printDigits(n);
    }

    public static void printDigits(int n) {
        if (n > 0) {
            int digit = n % 10;
            System.out.print(digit + " ");
            printDigits(n / 10);
        }
    }
}
