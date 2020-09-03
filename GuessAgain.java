import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessAgain {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int numGuesses = 0;
        int randomNumber = new Random().nextInt(10) + 1;

        out.println("Welcome to the game!");
        out.println();

        out.println("Введите число 1 до 10: ");
        int inputNumber = keyboard.nextInt();
        numGuesses++;

        while (inputNumber != randomNumber) {
            out.println();
            out.println("Попытайтесь ещё раз...");
            out.print("Введите число 1 до 10: ");
            inputNumber = keyboard.nextInt();
            numGuesses++;
        }
        out.print("Вы угадали после ");
        out.println(numGuesses + " попыток");

        keyboard.close();
    }
}
