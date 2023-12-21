package Practice_3.Tasks_for_shell_classes;
public class Exercise_1 {
    public static void main(String[] args) {
        Double n_1 = Double.valueOf(4.5463);
        System.out.println("n_1 = " + n_1);

        String str = "6.345443";
        double n_2 = Double.parseDouble(str);
        System.out.println("n_2 = " + n_2);

        Double n_3 = 3.14;
        int primitiveInt = n_3.intValue();
        System.out.println("int = " + primitiveInt);
        byte primitiveByte = n_3.byteValue();
        System.out.println("byte = " + primitiveByte);
        short primitiveShort = n_3.shortValue();
        System.out.println("short = " + primitiveShort);
        long primitiveLong = n_3.longValue();
        System.out.println("long = " + primitiveLong);
        float primitiveFloat = n_3.floatValue();
        System.out.println("float = " + primitiveFloat);
        char primitiveChar = (char)n_3.shortValue();
        System.out.println("char = " + primitiveChar);

        System.out.println("n_3 = " + n_3);

        String d = Double.toString(3.14);
    }
}
