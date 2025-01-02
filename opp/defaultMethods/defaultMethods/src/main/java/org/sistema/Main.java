package org.sistema;

import entities.BrazilInterestService;
import entities.Loan;
import entities.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));


        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantia do empréstimo: ");
        Double q = sc.nextDouble();
        System.out.print("Digite a duranção de meses do empréstimo: ");
        int meses = sc.nextInt();

        Loan loan = new Loan(q, meses, new UsaInterestService(9.0));

        System.out.println(loan.getInterestService());



    }
}