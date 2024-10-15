package programm;
import entities.Produtos;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produtos produto = new Produtos();

        System.out.print("Digite um número inteiro: ");
        int qtdDeProdutos  = sc.nextInt();

        for (int i = 0; i < qtdDeProdutos; i++) {
               System.out.print("Digite o nome do produto: ");
               String nome = sc.next();

               System.out.print("Digite o preço do produto:");
               double preco = sc.nextDouble();

               produto.setProdutos(nome, preco);
        }

        System.out.println("PREÇO MÉDIO" + produto.calcularPrecoMedio());

    }
}
