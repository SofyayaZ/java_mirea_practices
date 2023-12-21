package Practice_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Exercise_3 {
    public static void main(String[] args) {
        String str = "Text with prices: 25.98 USD, 44 ERR, 0.004 EU, 50 RUB";
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?(USD|EU|RUB)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String price = matcher.group();
            System.out.println(price);
        }
    }
}
