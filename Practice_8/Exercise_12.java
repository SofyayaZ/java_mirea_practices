package Practice_8;
import java.util.*;
public class Exercise_12 {
    public static void printOddNumbers() {
        Scanner inFromUser = new Scanner(System.in);
        int n;
        while ((n = inFromUser.nextInt()) != 0) {
            if (n % 2 != 0) {
                System.out.println(n);
            }
        }
        inFromUser.close();
    }

    public static void main(String[] args) {
        printOddNumbers();
    }
}
