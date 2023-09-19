package Practice_2.Exercise_5;

import java.util.Scanner;
public class DogKennel {
    public static void main(String[] args) {
        Scanner inFromUser = new Scanner(System.in);
        System.out.println("Enter the number of dogs: ");
        int size = inFromUser.nextInt();
        Dog[] dogs = new Dog[size];
        String name;
        int age;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter tne name of the " + (i + 1) + " dog: ");
            name = inFromUser.next();
            System.out.println("Enter tne age of the " + (i + 1) + " dog: ");
            age = inFromUser.nextInt();
            dogs[i] = new Dog(name, age);
        }
        for (int i = 0; i < size; i++) {
            System.out.println("The human age of " +
                    dogs[i].getName() + " is " +
                    dogs[i].getHumanAge() + " years");
        }
    }
}
