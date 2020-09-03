import static  java.lang.System.in;
import static  java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main (String args[]) {
        Scanner keyboard = new Scanner(in);

        out.print("Введите число от 1 до 10: ");

        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;

        if (inputNumber == randomNumber) {
            out.println("*You Win!*");
        }
            out.println("nice try");
            out.println("Exellent number ");
            out.println(randomNumber + ".");
            out.println("Thanks for the playing");

        keyboard.close();
    }
}
