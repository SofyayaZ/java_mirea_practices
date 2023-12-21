package Practice_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Exercise_4 {
    public static void main(String[] args) {
        String expression1 = "(1+8)-9/4";
        String regex = "\\+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expression1);
        if (matcher.find()) {
            System.out.println("Correct expression");
        }
        else {
            System.out.println("Wrong expression");
        }
    }
}
