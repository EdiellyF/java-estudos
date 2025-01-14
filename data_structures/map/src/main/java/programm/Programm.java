package programm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Programm {
    public static void main(String[] args) {

        String path = "C:\\Users\\ediel\\Documents\\workspace-vscode\\java-estudos\\data_structures\\map\\src\\main\\int.txt";
        Map<String, Integer> candidatos = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] campos = line.split(",");
                String nome = campos[0].toLowerCase().trim();
                int qtdVotos = Integer.parseInt(campos[1]);

                candidatos.put(nome, candidatos.getOrDefault(nome, 0) + qtdVotos);


                line = br.readLine();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (String key : candidatos.keySet()) {
            System.out.println(key.toUpperCase() + ": " + candidatos.get(key));
        }

    }

}
