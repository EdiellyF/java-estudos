import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number:");
            int num = sc.nextInt();
            System.out.print("Holder:");
            String holder = sc.nextLine();
            sc.nextLine();
            System.out.print("Initial balance:");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit:");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(num, holder, initialBalance, withdrawLimit);

            System.out.print("Enter amount for withdraw:");
            Double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);
            System.out.print("New balance:" + account.getBalance());


        } catch (DomainException e){
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }


    }
}