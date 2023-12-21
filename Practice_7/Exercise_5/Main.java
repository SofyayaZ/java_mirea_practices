package Practice_7.Exercise_5;

public class Main {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulatorImpl();

        String s = "Hello, World!";

        int characterCount = manipulator.countCharacters(s);
        System.out.println("Character count: " + characterCount);

        String oddCharacters = manipulator.getOddCharacters(s);
        System.out.println("Odd characters: " + oddCharacters);

        String reversedString = manipulator.reverseString(s);
        System.out.println("Reversed string: " + reversedString);
    }
}
