package Practice_8;
import java.util.*;
public class Exercise_11 {
    public static int countOnes() {
        Scanner inFromUser = new Scanner(System.in);
        String str = inFromUser.nextLine();
        int k = 0; int count = 0;

        for (int i = 0; i < str.length(); i++) {
            int n = Character.getNumericValue(str.charAt(i));
            if (n == 1) {
                count += 1;
                k = 0;
            }
            else if (n == 0) {
                k += 1;
            }
            if (k == 2)
                break;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countOnes());
    }
}
