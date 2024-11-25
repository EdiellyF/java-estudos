import entities.Departament;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevelEnums;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o nome do departamento:");
        String nomeDepartamento = sc.nextLine();
        Departament departament = new Departament(nomeDepartamento);
        System.out.println("Entre com os dados do trabalhador");
        System.out.print("Nome do trabalhador:");
        String nome = sc.nextLine();
        System.out.print("Level do trabalhador:");
        WorkerLevelEnums level = WorkerLevelEnums.valueOf(sc.next());
        System.out.print("Salario Base do trabalhador:");
        double salarioBase = sc.nextDouble();

        System.out.print("Quantos contratos esse trabalhador fez?");
        int contratos = sc.nextInt();

        Worker worker = new Worker(nome, level , salarioBase, departament);

        for (int i = 0; i < contratos; i++) {
            System.out.println("Entre com os dados do contrato #" + (i + 1));
            System.out.print("Data (DD/MM/YYYY):");
            String dateString = sc.next();
            System.out.print("Valor por hora:");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duração (horas):");
            int duracao = sc.nextInt();

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            Date dataAtual = null;
            try {
                dataAtual = formato.parse(dateString);
            } catch (ParseException e) {
                System.out.println("Erro ao converter a data: " + e.getMessage());
                return;
            }

            HourContract contrato = new HourContract(dataAtual, valorPorHora, duracao);
            worker.addContract(contrato);
        }

        System.out.println("Enter mes and year to calculate income (MM/YYYY)");
        String date = sc.next();
        LocalDate data = LocalDate.parse("01/" + date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));


        int year = data.getYear();
        int mes = data.getMonthValue();



        System.out.println("Name:" + worker.getNome());
        System.out.println("Departament: " + worker.getDepartament());
        System.out.println("Income for: " + worker.income(year, mes));


        }
    }
