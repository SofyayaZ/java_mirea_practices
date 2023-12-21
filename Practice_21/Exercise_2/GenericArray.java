package Practice_21.Exercise_2;

public class GenericArray<T> {
    private T[] array;
    public GenericArray(int size) {
        array = (T[]) new Object[size];
    }
    public void set(int index, T element) {
        array[index] = element;
    }
    public T get(int index) {
        return array[index];
    }
    public int size() {
        return array.length;
    }
}
