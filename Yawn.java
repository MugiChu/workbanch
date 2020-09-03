import static java.lang.System.out;

public class Yawn {

    public static void main(String args[]) {
        for (int count = 1; count <= 10; count++) {
            out.print("Значение счетчика равно ");
            out.print(count);
            out.println(".");
        }

        out.println("Достаточно!");
    }
}
