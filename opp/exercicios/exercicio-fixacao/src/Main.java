import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.print("Digite a quantidade de produtos a ser preenchidos: ");
        int produtos = sc.nextInt();

        List<Product> produtoList = new ArrayList<Product>();

        for (int i = 0; i < produtos; i++) {

            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported(c/u/i)?");
            char typeProduct = sc.next().charAt(0);
            System.out.print("Name:");
            String name = sc.next();
            System.out.print("Price:");
            Double price = sc.nextDouble();



            Product product;
            if (typeProduct == 'i'){
                System.out.print("Customsfee:");
                Double customfee = sc.nextDouble();
                product = new ImportedProduct(name, price,  customfee);

            } else if (typeProduct == 'u'){
                System.out.print("Manufacturedate (DD/MM/YYYY):");

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate data = null;
                boolean dataValida = false;

                while (!dataValida) {
                    System.out.print("Digite uma data no formato yyyy-MM-dd: ");
                    String entrada = sc.nextLine();

                    try {
                        data = LocalDate.parse(entrada, formatter);
                        dataValida = true; // Sai do loop se a data for válida
                    } catch (DateTimeParseException e) {
                        System.out.println("Data inválida! Tente novamente.");
                    }
                }

                product = new UsedProduct(name, price, data);
            } else {
                product = new Product(name, price);
            }

            produtoList.add(product);
        }

        System.out.println("PRICE TAGS: ");
        for (Product p : produtoList) {
           System.out.println(p.priceTag());
        }

    }
}