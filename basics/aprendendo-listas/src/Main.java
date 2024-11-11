import entities.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = Integer.parseInt(sc.nextLine()); 

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ":");

            System.out.print("Id: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Name: ");
            String nome = sc.nextLine(); 

            System.out.print("Salary: ");
            double salary = Double.parseDouble(sc.nextLine()); 

            Funcionario funcionario = new Funcionario(id, nome, salary);
            funcionarios.add(funcionario);
        }

        System.out.print(" Enter the employee id that will have salary increase :");
        int idFuncionario = sc.nextInt();

        int id = -1;
        for (Funcionario funcionario : funcionarios) {
            if(funcionario.getId() == idFuncionario){
               id = idFuncionario;
               System.out.print(" Enterthe percentage:");
               double percentage = sc.nextDouble();
               funcionario.AumentarSalario(percentage);
               break;
            }
        }

        if(id == -1){
            System.out.println("This id does not exist!");
        }

        System.out.println("List of employees:");


        funcionarios.forEach(funcionario -> System.out.println(funcionario));


        sc.close();
    }
}
