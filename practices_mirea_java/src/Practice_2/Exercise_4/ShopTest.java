package Practice_2.Exercise_4;

import java.util.List;
import java.util.Scanner;

public class ShopTest {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner inFromUser = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add a computer");
            System.out.println("2. Delete a computer");
            System.out.println("3. Search computer by a criteria");
            System.out.println("4. Exit");
            System.out.print("Enter the number of your choice: ");
            choice = inFromUser.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the manufacturer of the computer: ");
                    String manufacturer = inFromUser.next();
                    System.out.print("Enter the model of the computer: ");
                    String model = inFromUser.next();
                    System.out.print("Enter the price of the computer: ");
                    double price = inFromUser.nextDouble();
                    Computer computer = new Computer(manufacturer, model, price);
                    shop.addComputer(computer);
                    break;
                case 2:
                    System.out.print("Enter the name of the manufacturer: ");
                    String manufacturerToRemove = inFromUser.next();
                    List<Computer> computersToRemove = shop.searchComputers(manufacturerToRemove);
                    if (!computersToRemove.isEmpty()) {
                        System.out.println("The computer " + computersToRemove.get(0).toString() + " has been deleted");
                        shop.removeComputer(computersToRemove.get(0));
                    } else {
                        System.out.println("The computers have not been found");
                    }
                    break;
                case 3:
                    System.out.print("Enter the name of the manufacturer or the model of the computer that you want to find: ");
                    String searchCriteria = inFromUser.next();
                    List<Computer> foundComputers = shop.searchComputers(searchCriteria);
                    if (!foundComputers.isEmpty()) {
                        System.out.println("The list of the computers:");
                        for (Computer foundComputer : foundComputers) {
                            System.out.println(foundComputer);
                        }
                    } else {
                        System.out.println("The computers has not been found");
                    }
                    break;
                case 4:
                    System.out.println("Ending of the programme");
                    break;
                default:
                    System.out.println("Incorrect input");
            }
            System.out.println();
        } while (choice != 4);
    }
}
