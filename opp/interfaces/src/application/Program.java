package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do alugel:");
        System.out.println("Modelo do carro");
        String carModel = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy  hh:mm):");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("Retorno (dd/MM/yyyy  hh:mm):");
        LocalDateTime end = LocalDateTime.parse(sc.nextLine(), fmt);


        CarRental cr = new CarRental( start, end, new Vehicle(carModel));

        System.out.println("Entre com o preço por hora:");
        double precoPorHora = sc.nextDouble();
        System.out.println("Entre com o preço por dia:");
        double precoPorDia = sc.nextDouble();


        RentalService rentalService = new RentalService( precoPorDia,precoPorHora, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
