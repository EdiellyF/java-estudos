import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers:");
        int n = sc.nextInt();

        List<Pessoa> listapessoas = new ArrayList<Pessoa>();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data");
            System.out.print("Individual or company(i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name:");
            String name = sc.next();
            System.out.print("Anual income:");
            double anualIncome = sc.nextDouble();

            Pessoa pessoa;

            if (ch == 'i') {
                System.out.print("Health expenditures:");
                Double healthExpenditures = sc.nextDouble();
                pessoa = new PessoaFisica(name, anualIncome, healthExpenditures);
            } else {
                System.out.print("Number of employees:");
                int employees = sc.nextInt();
                pessoa = new PessoaJuridica(name, anualIncome, employees);
            }

            listapessoas.add(pessoa);
        }


        listapessoas.forEach(p -> System.out.println(p.toString()));

        sc.close();

    }
}