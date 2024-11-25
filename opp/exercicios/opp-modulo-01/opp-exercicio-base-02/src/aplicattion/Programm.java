package aplicattion;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;


public class Programm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        Scanner sc = new Scanner(System.in);
        Employee funcionario = new Employee();

        System.out.print("Digite o nome, o salario bruto e a taxa do funcionário: ");
        funcionario.Name = sc.nextLine();
        funcionario.GrossSalary = sc.nextDouble();
        funcionario.Tax = sc.nextInt();

        System.out.println("Employee: " + funcionario);

        System.out.println("qual porcentagem deseja acrescentar ao salário do funcionário: ");
            double porcentagem = sc.nextDouble();
            funcionario.increaseSalary(porcentagem);

        System.out.println("Update data:" + funcionario);

        sc.close();
    }
}
