package Practice_21.Exercise_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Converter {
    public static <T> List<T> arrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
