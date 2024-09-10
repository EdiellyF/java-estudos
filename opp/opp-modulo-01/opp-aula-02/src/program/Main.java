package program;

import entities.Produto;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.print("Digite o nome:");
             produto.name = sc.next();
        System.out.print("o preço:");
             produto.price = sc.nextDouble();
        System.out.print("Digite a quantidade no estoque:");
            produto.quantity = sc.nextInt();

            System.out.println();
            System.out.println("Produto data: " + produto);

            System.out.println("Enter the number of products to be added in stock:");
                int x =  sc.nextInt();
                produto.addProducts(x);
                System.out.println("Produto data: " + produto);
      
                System.out.println(" Enter the number of products to be removed from stock:");
                x =  sc.nextInt();
                produto.removeProducts(x);
                System.out.println("Produto data: " + produto);
    }

    
}
