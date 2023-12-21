package Practice_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Exercise_2 {
    public static void main(String[] args) {
        String input1 = "abcdefghijklmnopqrstuv18340";
        String input2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        String regex = "abcdefghijklmnopqrstuv18340";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher1 = pattern.matcher(input1);
        if (matcher1.matches()) {
            System.out.println("String " + input1 + " is a correct string.");
        }
        else {
            System.out.println("String " + input1 + " isn't a correct string.");
        }

        Matcher matcher2 = pattern.matcher(input2);
        if (matcher2.matches()) {
            System.out.println("String " + input2 + " is a correct string.");
        }
        else {
            System.out.println("String " + input2 + " isn't a correct string.");
        }
    }
}
