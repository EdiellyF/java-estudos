package program;

import entities.Produto;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome:");
             String name = sc.next();
        System.out.print("o preço:");
            double  price = sc.nextDouble();
  

        Produto produto = new Produto(name, price);



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
