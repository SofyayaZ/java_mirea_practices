package Practice_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Exercise_7 {
    public static void main(String[] args) {
        String password = "F032_Password";
        String regex = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Correct password");
        }
        else {
            System.out.println("Wrong password");
        }
    }
}
