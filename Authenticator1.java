import static  java.lang.System.out;
import java.util.Scanner;

public class Authenticator1 {

    public  static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Имя пользователя: ");
        String username = keyboard.next();

        if (username.equals("bburd")) {
            out.print("Пароль: ");
            String password = keyboard.next();

            if (password.equals("swordfish")) {
                out.println("Вы в системе!");
            }else{
                out.println("Неправильно пароль.");
            }

        } else {
            out.println("Неизвестный пользователь");
        }
        keyboard.close();
    }
}
