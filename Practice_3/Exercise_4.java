package Practice_3;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
public class Exercise_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.print("Enter the size of the array: ");
        Scanner inFromUser = new Scanner(System.in);
        int n = inFromUser.nextInt();
        int[] arr = new int[n];
        List<Integer> evenArr = new ArrayList<> ();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n);
            System.out.print(arr[i]);
            if (i!=n - 1) {
                System.out.print(", ");
            }
            if (arr[i]%2==0) {
                evenArr.add(arr[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < evenArr.size(); i++) {
            System.out.print(evenArr.get(i));
            if (i != evenArr.size() - 1) {
                System.out.print(", ");
            }
        }

    }
}
