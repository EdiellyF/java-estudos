package org.sistema;

import entities.Product;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);


        Set<Product> products = new TreeSet<>();

        products.add(new Product("TV", 999.0));
        products.add(new Product("Tablet", 999.0));
        products.add(new Product("Notebook", 999.0));

        for (Product product : products) {
            System.out.println(product);
        }
//        System.out.println("Digite a quantidade de produtos que deseja instanciar:");
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        for (int i = 0; i < n; i++) {
//            System.out.print("name: ");
//            String name = sc.nextLine();
//
//            System.out.print("price: ");
//            double price = sc.nextDouble();
//            sc.nextLine();
//            Product p = new Product(name, price);
//            products.add(p);
//
//            System.out.println(products.contains(p));
//        }



        sc.close();
    }
}