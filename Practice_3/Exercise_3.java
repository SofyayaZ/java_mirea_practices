package Practice_3;

import java.util.Random;
public class Exercise_3 {
    public static void main(String[] args) {
        int size = 4;
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(10,100);
            System.out.print(arr[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
        }
        boolean f = false;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] >= arr[i+1]) {
                System.out.println("\nThe array is not a strictly ascending sequence");
                f = true;
                break;
            }
        }
        if (f == false) {
            System.out.println("\nThe array is a strictly ascending sequence");
        }
    }
}
