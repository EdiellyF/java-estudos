import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaemJava {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Evening"};

        String path = "C:\\Users\\ediel\\Documents\\workspace-vscode\\java-estudos\\notes\\arquivos-em-java-file\\out.txt";

        try (BufferedWriter bw = new BufferedWriter( new FileWriter(path, true))) {
            for(String line: lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
