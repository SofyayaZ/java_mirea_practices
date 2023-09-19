package Practice_2.Exercise_9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.lang.*;
public class Poker {
    public static void main(String[] args) {
        System.out.print("Enter the number of players: ");
        Scanner inFromUser = new Scanner(System.in);
        int n = inFromUser.nextInt();
        List<String> cards = new ArrayList<>();
        cards.add("Ah"); cards.add("2h"); cards.add("3h"); cards.add("4h"); cards.add("5h"); cards.add("6h"); cards.add("7h"); cards.add("8h"); cards.add("9h"); cards.add("10h"); cards.add("Jh"); cards.add("Qh"); cards.add("Kh");
        cards.add("Ad"); cards.add("2d"); cards.add("3d"); cards.add("4d"); cards.add("5d"); cards.add("6d"); cards.add("7d"); cards.add("8d"); cards.add("9d"); cards.add("10d"); cards.add("Jd"); cards.add("Qd"); cards.add("Kd");
        cards.add("As"); cards.add("2s"); cards.add("3s"); cards.add("4s"); cards.add("5s"); cards.add("6s"); cards.add("7s"); cards.add("8s"); cards.add("9s"); cards.add("10s"); cards.add("Js"); cards.add("Qs"); cards.add("Ks");
        cards.add("Ac"); cards.add("2c"); cards.add("3c"); cards.add("4c"); cards.add("5c"); cards.add("6c"); cards.add("7c"); cards.add("8c"); cards.add("9c"); cards.add("10c"); cards.add("Jc"); cards.add("Qc"); cards.add("Kc");
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
