package Practice_1;
public class Exercise_1 {
    public static void main(String[] args) {
        int[] arr = {3,4,1,0,12,41,5,7,28};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        System.out.println("ar_mean = " + sum/arr.length);
    }
}