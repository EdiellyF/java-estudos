package Programm;

import model.entities.Item;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o caminho do arquivo: ");
        String path = sc.nextLine();


        List<Item> itens = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            String[] partesItens;
            while (line != null) {
                partesItens = line.split(",");
                Double precoUnitario = Double.parseDouble(partesItens[1]);
                int quantidade = Integer.parseInt(partesItens[2]);

                Item item = new Item(partesItens[0], precoUnitario, quantidade);
                itens.add(item);
                line = br.readLine();
            }

          String pathOut = "C:\\Users\\ediel\\Documents\\workspace-vscode\\java-estudos\\opp\\arquivos_java_projeto_atividade\\src\\out\\summary.csv";

              try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))) {
                    for (Item produto: itens){
                        bw.write(produto.toString());
                        bw.newLine();
                    }
              } catch (IOException e){
                  System.out.println(e.getMessage());
              }


        } catch (IOException e) {
            System.out.println(" " + e.getMessage());
        }
    }
}