import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File file = new File("");
        Scanner sc = null;

        try {
          sc = new Scanner(file);
          while (sc.hasNextLine()) {
              System.out.println(sc.nextLine());
          }
        } catch (IOException e) {
            System.out.println("Erro ao abrir arquivo" + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }

        }

    }
}