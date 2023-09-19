package Practice_1;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner inFromUser = new Scanner(System.in);
        System.out.println("Enter how many numbers will be in your array: ");
        int size = inFromUser.nextInt();
        int[] arr = new int[size];
        int i = 0;
        if (size>=1) {
            System.out.println("Enter your number: ");
            do {
                arr[i] = inFromUser.nextInt();
                i += 1;
            } while (i < size);
            i = 0;
            int sum = 0;
            int max_el = -2 ^ 32;
            int min_el = 2 ^ 32 - 1;
            while (i < size) {
                sum += arr[i];
                if (min_el > arr[i]) min_el = arr[i];
                if (max_el < arr[i]) max_el = arr[i];
                i+=1;
            }
            System.out.println ("sum = " + sum + "\nmin_el = " + min_el + "\nmax_el = " + max_el);
        } else {
            System.out.println ("Your array is empty");
        }
    }
}