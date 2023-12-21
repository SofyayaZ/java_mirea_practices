package Practice_3.Exercises_for_format_strings;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class App {
    public static void main(String[] args) {
        Scanner inFromUser = new Scanner(System.in);
        System.out.print("Enter the price of the purchase: ");
        double price = inFromUser.nextDouble();
        System.out.println("Choose the currency for payment: ");
        System.out.println("1 euro"); System.out.println("2 dollar");
        System.out.println("3 pound");System.out.println("4 yuan");
        System.out.println("5 ruble");
        int choice = inFromUser.nextInt();
        NumberFormat numberFormat = NumberFormat.getInstance();
        double totalPrice;
        switch (choice) {
            case 1:
                numberFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
                totalPrice = price * 0.00978; break;
            case 2:
                numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
                totalPrice = price * 0.010412; break;
            case 3:
                numberFormat = NumberFormat.getCurrencyInstance(Locale.UK);
                totalPrice = price * 0.008473; break;
            case 4:
                numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
                totalPrice = price * 0.076095; break;
            default:
                numberFormat = NumberFormat.getCurrencyInstance();
                totalPrice = price * 1; break;
        }
        System.out.println(numberFormat.format(totalPrice));
    }
}
