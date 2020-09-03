import static java.lang.System.out;
import java.util.Scanner;

public class JustSwitchIt {

    public static void main (String args[]) {
        Scanner keyboard = new Scanner (System.in);
        out.print("Почему Эл стоит под дождем? Введите номер: ");
        String verse = keyboard.next();

        switch (verse) {
            case "one":
                out.println("Потому что дождь идет очень долго.");
                break;
            case "two":
                out.println("Потому что он очень расстроен.");
                break;
            case "three":
                out.println("Потому что он все равно уже мокрый.");
                break;
            default:
                out.println("Такой причины нет. Попытайтесь ещё раз.");
                break;
        }
        out.println("О-ооооо...");

        keyboard.close();
    }
}
