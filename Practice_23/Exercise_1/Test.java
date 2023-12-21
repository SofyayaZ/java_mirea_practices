package Practice_23.Exercise_1;

public class Test {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();

        queue.enqueue(13);
        queue.enqueue(12);
        queue.enqueue(23);

        System.out.println("Queue size: " + queue.size());
        System.out.println("1st element: " + queue.element());

        System.out.println("Deleted element: " +queue.dequeue());
        System.out.println("Queue size: " + queue.size());
        System.out.println("1st element: " + queue.element());

        System.out.println("Queue is empty? " + queue.isEmpty());
        queue.clear();
        System.out.println("Queue is empty? " + queue.isEmpty());
    }
}
