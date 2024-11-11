import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter client data:");
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Email:");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY):");
        String birthDate = sc.nextLine();

        Client cliente = new Client(name, email, birthDate);

        System.out.println("Enter order data");
        System.out.print("Status:");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Date date = new Date();
        Order order = new Order(date, status, cliente);


        System.out.print("How many items to this order:");
        int items = sc.nextInt();

        for(int i= 0; i < items; i++){
            System.out.println("Enter #" + (i + 1) + "item data:");
            System.out.print("Product name:");
            name = sc.next();
            System.out.print("Product price:");
            double price = sc.nextDouble();
            System.out.print("Quantity:");
            int quantity = sc.nextInt();

            Product product = new Product(name, price);

            OrderItem oneItem = new OrderItem(quantity, product);

            order.addItem(oneItem);


        }

        System.out.println(order);







    }
}