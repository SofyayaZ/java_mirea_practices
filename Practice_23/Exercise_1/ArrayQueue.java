package Practice_23.Exercise_1;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Object[] elements;
    private int size;
    private int front;
    private int rear;
    public ArrayQueue() {
        elements = new Object[4];
        size = 0;
        front = 0;
        rear = 0;
    }
    public void enqueue(Object element) {
        if (size == elements.length) {
            resize();
        }
        elements[rear] = element;
        rear++;
        size++;
    }
    public Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return elements[front];
    }
    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        Object element = elements[front];
        elements[front] = null;
        front++;
        size--;

        return element;
    }
    public boolean isEmpty() {
        return size==0;
    }
    public int size() {
        return size;
    }
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[front + i] = null;
        }
        front = 0;
        size = 0;
        rear = 0;
    }
    private void resize() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[front + i];
        }
        elements = newElements;
        front = 0;
        rear = size;
    }
}
