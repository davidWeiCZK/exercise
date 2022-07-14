import java.util.Random;
import java.util.Scanner;

public class Heads_Or_Tail {
    public static void main(String[] strings) {
        int rounds = 0;
        int head_count = 0;
        int tail_count = 0;

        System.out.println("Tossing a coin...");

        for (int i = 0; i < 3; i++) {

            int coinSide = new Random().nextInt(2);
            if (coinSide == 0) {
                rounds ++;
                System.out.println("Round " + rounds + ": Heads");
                head_count ++;
            } else {
                rounds ++;
                System.out.println("Round " + rounds + ": Tails");
                tail_count ++;
            }
        }

        System.out.println("Heads: " + head_count + ", Tails: " + tail_count);

    }
}