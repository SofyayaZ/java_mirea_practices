package Practice_2.Exercise_8;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Banana", "Strawberry", "Raspberry", "Melon", "Watermelon"};
        for (int i = 0; i < arr.length/2; i++) {
            String tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
