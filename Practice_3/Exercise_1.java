package Practice_3;
import java.util.Random;
public class Exercise_1 {
    public static void main(String[] args) {
        int size = 10;
        Double[] array = new Double[size];
        Random rand = new Random();
        System.out.println("The first array: ");
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextDouble(10);
            System.out.printf("%.2f",array[i]);
            if (i != size - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("\nSorted array: ");
        quickSort(array, 0, size - 1);
        for (int i = 0; i < size; i++) {
            System.out.printf("%.2f",array[i]);
            if (i != size - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("\nThe second array: ");
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
            System.out.printf("%.2f",array[i]);
            if (i != size - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("\nSorted array: ");
        quickSort(array, 0, size - 1);
        for (int i = 0; i < size; i++) {
            System.out.printf("%.2f",array[i]);
            if (i != size - 1) {
                System.out.print(" ");
            }
        }
    }
    static int partition(Double[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                Double temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        Double temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }
    public static void quickSort(Double[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
    }
}
