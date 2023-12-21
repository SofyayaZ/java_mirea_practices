import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Exercise_5 {

    public static void main(String[] args) {
        int size = 100000;
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();


        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(size));
        }
        long endTime = System.nanoTime();
        long arrayListInsertTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(random.nextInt(size));
        }
        endTime = System.nanoTime();
        long linkedListInsertTime = endTime - startTime;
        System.out.println("ArrayList insert: " + arrayListInsertTime/1000000 + " ms");
        System.out.println("LinkedList insert: " + linkedListInsertTime/1000000 + " ms");


        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.remove(0);
        }
        endTime = System.nanoTime();
        long arrayListRemoveTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        long linkedListRemoveTime = endTime - startTime;
        System.out.println("ArrayList remove: " + arrayListRemoveTime/1000000 + " ms");
        System.out.println("LinkedList remove: " + linkedListRemoveTime/1000000 + " ms");


        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(0, random.nextInt(size));
        }
        endTime = System.nanoTime();
        long arrayListAddTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(0, random.nextInt(size));
        }
        endTime = System.nanoTime();
        long linkedListAddTime = endTime - startTime;
        System.out.println("ArrayList add: " + arrayListAddTime/1000000 + " ms");
        System.out.println("LinkedList add: " + linkedListAddTime/1000000 + " ms");


        int target = random.nextInt(size);
        startTime = System.nanoTime();
        arrayList.contains(target);
        endTime = System.nanoTime();
        long arrayListSearchTime = endTime - startTime;

        startTime = System.nanoTime();
        linkedList.contains(target);
        endTime = System.nanoTime();
        long linkedListSearchTime = endTime - startTime;

        System.out.println("ArrayList search element (contains): " + arrayListSearchTime/1000000 + " ms");
        System.out.println("LinkedList search element (contains): " + linkedListSearchTime/1000000 + " ms");
    }
}