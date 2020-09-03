import java.io.File;
import static java.lang.System.out;
import java.util.Scanner;

public class DeleteEvidence {

    public static void main (String args[]) {
        File evidence = new File("cookedBooks.txt");
        Scanner keyboard = new Scanner(System.in);
        char reply;

        do {
            out.print("Удалить файл ? (y/n) ");
            reply = keyboard.findWithinHorizon(".",0).charAt(0);
        } while (reply != 'y' && reply != 'Y' &&
        reply != 'n' && reply!='N');

        if (reply == 'y' || reply == 'Y') {
            out.println("Ладно, удаляю.");
            evidence.delete();
            out.println("Файл удален.");
        }else{
            out.println("Ладно, не удаляю. зайка... <3");
        }

        keyboard.close();
    }

}
