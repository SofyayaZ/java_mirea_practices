package Practice_13.Exercise_1;

public class Main {
    public static void main(String[] args) {
        String text = "I like Java";
        char lastChar = text.charAt(text.length() - 1);
        boolean endsWithExclamation = text.endsWith("!!!");
        System.out.println(endsWithExclamation);
        boolean startsWithILike = text.startsWith("I like");
        System.out.println(startsWithILike);
        boolean containsJava = text.contains("Java");
        System.out.println(containsJava);
        int position = text.indexOf("Java");
        System.out.println(position);
        String replacedText = text.replace('a', 'o');
        System.out.println(replacedText);
        String uppercaseText = text.toUpperCase();
        System.out.println(uppercaseText);
        String lowercaseText = text.toLowerCase();
        System.out.println(lowercaseText);
        String subString = text.substring(text.indexOf("Java"), text.indexOf("Java") + 4);
        System.out.println(subString);
    }
}
