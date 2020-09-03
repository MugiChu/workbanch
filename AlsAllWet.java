import static java.lang.System.out;

public class AlsAllWet {

    public static void main(String args[]) {

        for (int verse = 1; verse <= 3; verse++) {
            out.print("Эл весь мокрый. ");
            out.println("Почему Эл весь мокрый? ");
            out.println("Потому что он стоит под дождем");
            out.println("Почему Эл стоит под дождем?");

            switch (verse) {
                case 1:
                    out.println("потому что дождь идет очень долго");
                    break;
                case 2:
                    out.println("Потому что он очент несчастлив");
                    break;
                case 3:
                    out.println("Потому что он все равно уже мокрый");
                    break;
            }

            switch (verse) {
                case 3:
                    out.println("Очень долго, очень долго...");
                case 2:
                    out.println("Очень, очень несчастлив.");
                case 1:
                    out.println("Все равно, все равно уже мокрый.");
            }
            out.println("Под дождем, под дождем");
            out.println("О-ооооооооо");
            out.println();
        }
        out.print("Эл весь мокрый");
        out.println("Почему Эл весь мокрый ?");
        out.print("Потому ято он стоит под дождем.");
        out.println("Под дождем под дождем.");
    }

}
