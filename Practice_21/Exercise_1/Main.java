package Practice_21.Exercise_1;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"Some", "text"};
        List<String> stringList = Converter.arrayToList(stringArray);
        System.out.println(stringList);

        Integer[] intArray = {1,2,3,4,5,6,7,8};
        List<Integer> intList = Converter.arrayToList(intArray);
        System.out.println(intList);
    }
}
