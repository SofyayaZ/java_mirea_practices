package Practice_19.Exercise_1;

import java.util.Scanner;

public class OnlinePurchase {
    public static void main(String[] args) {
        Scanner inFromUser = new Scanner(System.in);

        System.out.println("Enter your fio: ");
        String fio = inFromUser.nextLine();
        System.out.println("Enter your inn: ");
        String inn = inFromUser.nextLine();

        Client client = new Client(fio, inn);

        try {
            validateINN(client);
            System.out.println("The order was placed successfully.");
        }
        catch (InvalidINNException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void validateINN(Client client) throws InvalidINNException {
        if (client.getInn().length() != 10) {
            throw new InvalidINNException("Incorrect INN format.");
        }
    }
}
