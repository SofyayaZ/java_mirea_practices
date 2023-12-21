package Practice_14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Exercise_5 {
    public static void main(String[] args) {
        String date = "25/05/1990";
        String regex = "^(0[1-9]|1\\d|2[0-8])/(0[1-9]|1[0-2])/(((19)\\d\\d)|([2-9]\\d\\d\\d))$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        if (matcher.find()) {
            System.out.println("Correct date");
            System.out.println(matcher.group());
        }
        else {
            System.out.println("Wrong date");
        }
    }
}
