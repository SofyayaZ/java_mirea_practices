package Practice_6.Exercise_12;

public class Main {
    public static void main(String[] args) {
        StringBuilderWithUndo stringBuilder = new StringBuilderWithUndo();
        stringBuilder.append("White ");
        System.out.println(stringBuilder.toString());

        stringBuilder.append("Color");
        System.out.println(stringBuilder.toString());

        stringBuilder.delete(3, 8);
        System.out.println(stringBuilder.toString());

        stringBuilder.undo();
        System.out.println(stringBuilder.toString());

        stringBuilder.undo();
        System.out.println(stringBuilder.toString());

        stringBuilder.undo();
    }
}