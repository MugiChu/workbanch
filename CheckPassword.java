import static java.lang.System.*;
import java.util.Scanner;

public class CheckPassword {

    public static void main(String args[]) {

        out.print("Введите пароль: ");

        Scanner keyboard = new Scanner(in);
        String password = keyboard.next();

        out.println("Вы ввели >>" + password + "<<");
        out.println();

        if ("swordfish".equals(password)) {
            out.println("Этого не должно быть !");
            out.println("Введенный и хранящийся пароли.");
            out.println("Находятся в разных местах.");

        } else {
            out.println("Что и ожидалось!");
            out.println("Это две разные строки, хотя");
            out.println("их символы могут совпадать.");
        }
        out.println();

        if (password.equals("swordfish")) {
            out.println("Введенный пароль правильный!");
            out.println("Можете войти в систему");

        } else {
            out.println("Введенный пароль неправильный");
            out.println("Попытайтесь ещё раз...");
        }
        keyboard.close();
    }
}
