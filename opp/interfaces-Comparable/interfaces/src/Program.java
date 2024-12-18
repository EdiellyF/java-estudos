import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Program{
    public static void main(String[] args) {
        List<Funcionario> list= new ArrayList<>();
        String path= "C:\\Users\\ediel\\Documents\\workspace-vscode\\java-estudos\\opp\\interfaces-Comparable\\interfaces\\src\\in.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String FuncionarioCsv = br.readLine();

            while (FuncionarioCsv != null) {
                String[] partes = FuncionarioCsv.split(",");
                String name = partes[0];
                double salary = Double.parseDouble(partes[1]);
                list.add(new Funcionario(name, salary));

                FuncionarioCsv = br.readLine();
            }

            Collections.sort(list);

            list.forEach(c -> System.out.println(c.getNome() + " " + c.getSalary()));

            System.out.println();
        } catch(IOException e) {
                System.out.println("Error: " + e.getMessage());
 }
    }
}