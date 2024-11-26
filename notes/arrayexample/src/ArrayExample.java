import java.util.ArrayList;

public class ArrayExample {
    public static void main(String[] args) {


        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("ArrayList");
        lista.add("Dinâmico");

        lista.forEach(System.out::println);

    }
}
