import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");




    LocalDate d04 = LocalDate.parse("20/07/2024", fmt1);

    System.out.println(d04);
//
//
//        System.out.println(d04);
//        LocalDate d01 = LocalDate.now();
//        Instant d03 = Instant.now();
//        System.out.println(d01.toString());
//        System.out.println(d03.toString());
    }
}