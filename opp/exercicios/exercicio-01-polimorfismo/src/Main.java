import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> listaFuncionarios = new ArrayList<>();

        System.out.print("Enter the number of employees:");
        int numberEmployees = sc.nextInt();

        for(int i=0; i < numberEmployees; i++){
            System.out.println("Employee #"+ (i + 1) + " data:");
            System.out.print("Outsourced (y/n)");
            char outsourced = sc.next().charAt(0);
            System.out.print("Name:");
            String name = sc.next();
            System.out.print("Hours:");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour:");
            Double valuePerHour = sc.nextDouble();

            Employee employee;
            if(outsourced == 'y'){
                System.out.print("Additional charge:");
                Double additionalCharges = sc.nextDouble();
                employee = new OutsourcedEmployee(name,  hours, valuePerHour, additionalCharges);
            } else {
                 employee = new Employee(name,  hours, valuePerHour);
            }

            listaFuncionarios.add(employee);
        }

        System.out.print("PAYMENTS:");
        for(Employee employee: listaFuncionarios){
            System.out.println(employee);
        }





        sc.close();

    }
}