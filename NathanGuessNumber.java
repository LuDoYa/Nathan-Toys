import java.util.Scanner;
import java.lang.Math;

/**
     * Code is originally made by            : Nathaniel Takeshi
     * Editor & Proof-reader                 : Fikri Y. A.
     * Language Used (for sentencing)        : Indonesian (Bahasa)
*/

class NathanGuessNumber {
     public static void main(String[] args) {
          Scanner guess = new Scanner(System.in);

          System.out.println("Level Kesulitan :");
          System.out.println("(E = Easy, M = Medium, H = Hard)");
          String level = guess.nextLine();

          int level_range = 0, level_tries = 0;
          switch (level) {
               case "E" :
               case "e" :
                    level_range = 5;
                    System.out.println("Menebak dari 0 sampai " + level_range);
                    level_tries = 3;
                    System.out.println("Kesempatan mencoba : " + level_tries);
                    break;

               case "M" :
               case "m" :
                    level_range = 10;
                    System.out.println("Menebak dari 0 sampai " + level_range);
                    level_tries = 5;
                    System.out.println("Kesempatan mencoba : " + level_tries);
                    break;

               case "H" :
               case "h" :
                    level_range = 20;
                    System.out.println("Menebak dari 0 sampai " + level_range);
                    level_tries = 10;
                    System.out.println("Kesempatan mencoba : " + level_tries);
                    break;

               case "Ultimate" :
               case "ultimate" :
                    level_range = 100;
                    System.out.println("Menebak dari 0 sampai " + level_range);
                    level_tries = 150;
                    System.out.println("Kesempatan mencoba : " + level_tries);
                    break;

               case "Nathan" :
               case "nathan" :
                    level_range = 0;
                    System.out.println("Who dares to type this?");
                    level_tries = 1000;
                    System.out.println("You get an extra bonus stage.");
                    break;
               default:
                    System.out.println("Tolong, saya MINTA DENGAN SANGAT, masukkan tingkat kesulitan yang benar!!!");
                    System.exit(0);
                    break;
          }
          
          int TheNumber = (int) Math.round(Math.random() * level_range);
          
          int DasGuess = -1;
         
          int tries = 1;

          while (tries <= level_tries) {
               do {
                    System.out.print("Tebak : ");
                    while (!guess.hasNextInt()) {
                         String MajorError = guess.nextLine();
                         System.out.println("Haiyaah! SALAH!");
                         System.out.println("Ulang dari awal.");
                         System.exit(0);
                    }
               DasGuess = guess.nextInt();
               }
               while (DasGuess < 0);

               if (DasGuess == TheNumber) {
                    break;
               }
               else {
               tries++;
               }
          }

          if (DasGuess != TheNumber) {
               System.out.println("Hiyaa... Angka yang benar adalah : " + TheNumber);
          }
          else {
               System.out.println("Yes! Tebakannya benar!");
          }
     }
}
