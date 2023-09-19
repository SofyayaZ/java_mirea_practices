package Practice_2.Exercise_9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;
public class Poker {
    public static void main(String[] args) {
        System.out.print("Enter the number of players: ");
        Scanner inFromUser = new Scanner(System.in);
        int n = inFromUser.nextInt();
        List<String> cards = new ArrayList<>();
        cards.add("A♥"); cards.add("2♥"); cards.add("3♥"); cards.add("4♥"); cards.add("5♥"); cards.add("6♥"); cards.add("7♥"); cards.add("8♥"); cards.add("9♥"); cards.add("10♥"); cards.add("J♥"); cards.add("Q♥"); cards.add("K♥");
        cards.add("A♦"); cards.add("2♦"); cards.add("3♦"); cards.add("4♦"); cards.add("5♦"); cards.add("6♦"); cards.add("7♦"); cards.add("8♦"); cards.add("9♦"); cards.add("10♦"); cards.add("J♦"); cards.add("Q♦"); cards.add("K♦");
        cards.add("A♤"); cards.add("2♤"); cards.add("3♤"); cards.add("4♤"); cards.add("5♤"); cards.add("6♤"); cards.add("7♤"); cards.add("8♤"); cards.add("9♤"); cards.add("10♤"); cards.add("J♤"); cards.add("Q♤"); cards.add("K♤");
        cards.add("A♧"); cards.add("2♧"); cards.add("3♧"); cards.add("4♧"); cards.add("5♧"); cards.add("6♧"); cards.add("7♧"); cards.add("8♧"); cards.add("9♧"); cards.add("10♧"); cards.add("J♧"); cards.add("Q♧"); cards.add("K♧");
        cards.add("redWildcard"); cards.add("blackWildcard");
        if (n < 2 || n > 10) {
            System.out.println("The wrong number of players!");
        } else {
            Random random = new Random();
            for (int i = 0 ; i < n; i++) {
                System.out.print("Player " + (i + 1) + ": ");
                for (int j = 0; j < 5; j++) {
                    int randomCard = random.nextInt(cards.size());
                    System.out.print(cards.get(randomCard) + " ");
                    cards.remove(randomCard);
                }
                System.out.println();
            }
        }
    }
}
