import jdk.swing.interop.SwingInterOpUtils;
import model.domain.ContractService;
import model.domain.PaypalService;
import model.entities.Contract;
import model.entities.Installment;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        Integer num = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy):");
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.println("Valor do contrato: ");
        double valor = sc.nextDouble();


        Contract obj = new Contract(num, date, valor);


        System.out.println("Entre com o número de parcelas:");
        int numParcelas = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(obj, numParcelas);

            System.out.println("Parcelas:");

            for (Installment installment : obj.getInstallments()) {
                System.out.println(installment);
            }
    }
}