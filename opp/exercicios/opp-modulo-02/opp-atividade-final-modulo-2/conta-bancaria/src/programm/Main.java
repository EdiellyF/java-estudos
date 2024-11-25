package programm;

import entities.ContaBancaria;
import java.util.Locale;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number:");
        int numberAccont = sc.nextInt();

      
        System.out.print("Enter account holder:");
        String name = sc.next();
        System.out.print("Is there an initial deposit (y/n)?");
        char x = sc.next().charAt(0);

        ContaBancaria conta;

        if(x == 'y' || x == 'Y'){
            System.out.println("Enter the initial deposit value:");
            double depositoInicial = sc.nextDouble();
            conta = new ContaBancaria(numberAccont, name, depositoInicial);
            
        } else {
           conta = new ContaBancaria(numberAccont, name);
        }

        System.out.println("Account Data:");
        System.out.println(conta);

        System.out.print("Enter a deposit value:");
        double valorDeposito = sc.nextDouble();
        conta.realizarDeposito(valorDeposito);

        System.out.println("Updated account data:");
        System.out.println(conta);

        System.out.print("Enter a withdraw value:");
        double valorSaque = sc.nextDouble();
        conta.realizarSaque(valorSaque);

        System.out.println("Updated account data:");
        System.out.println(conta);



    }
}
