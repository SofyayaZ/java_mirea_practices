package Practice_21.Exercise_2;

public class Main {
    public static void main(String[] args) {
        GenericArray<Integer> intArray = new GenericArray<>(5);
        intArray.set(0,1);
        intArray.set(1,2);
        intArray.set(2,3);
        intArray.set(3,4);
        intArray.set(4,5);

        System.out.println("Elements in intArray: ");
        for (int i = 0; i < intArray.size(); i++) {
            System.out.println(intArray.get(i));
        }

        GenericArray<String> stringArray = new GenericArray<>(3);
        stringArray.set(0, "I");
        stringArray.set(1, "am");
        stringArray.set(2, "Sofya");

        for (int i = 0; i < stringArray.size(); i++) {
            System.out.println(stringArray.get(i));
        }
    }
}
