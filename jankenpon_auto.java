package game;

import java.util.*;
import java.lang.Math;

public class jankenpon_auto {
    public String player;
    public int the_hand;
    private int score;

    jankenpon_auto(String player) {
        this.player = player;
    }
    public static void main(String[] args) {
        jankenpon_auto player1 = new jankenpon_auto("Nathan");
        jankenpon_auto player2 = new jankenpon_auto("Computer");

        Scanner input = new Scanner(System.in);
        System.out.print("Mau sampai kemenangan ke berapa? ");
        int winnings = input.nextInt();
        input.close();

        player1.score = 0;
        player2.score = 0;

        while (player1.score < winnings && player2.score < winnings) {
            player1.the_hand = hand();
            player2.the_hand = hand();

            System.out.println(player1.player + " mengeluarkan " + player1.translate_hand(player1.the_hand));
            System.out.println(player2.player + " mengeluarkan " + player2.translate_hand(player2.the_hand));
            player1.jankenpon_algorithm(player2);
            System.out.println("---------------------------------------------------------------------------");
        }

        System.out.println();
        System.out.println(player1.player + " : " + player1.score);
        System.out.println(player2.player + " : " + player2.score);

        System.out.println("Selesai");
    }

    public static int hand() {
        int the_hand = (int) Math.round(Math.random() * 2);

        return the_hand;
    }

    public String translate_hand(int the_hand) {
        String[] jankenpon_list = {"Gunting", "Batu", "Kertas"};

        return jankenpon_list[the_hand];
    }

    public void jankenpon_algorithm(jankenpon_auto player1) {
        if (the_hand == 1 && player1.the_hand == 0) {
            Win(player);
        }
        else if (the_hand == 2 && player1.the_hand == 1) {
            Win(player);
        }
        else if (the_hand == 0 && player1.the_hand == 2) {
            Win(player);
        }
        else if (the_hand == player1.the_hand) {
            Draw();
        }
        else {
            player1.Win(player1.player);
        }
    }

    public void Win(String player) {
        System.out.println(player + " menang!");
        this.score++;
    }

    public void Draw() {
        System.out.println("Tidak ada yang menang.");
    }
}