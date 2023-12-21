package Practice_7.Exercise_6;

public class Main {
    public static void main(String[] args) {
        ProcessStrings processor = new ProcessStrings();

        String input = "Hello, world!";
        String processedString = processor.process(input);

        System.out.println("String: " + input);
        System.out.println("Processed string: " + processedString);
    }
}
