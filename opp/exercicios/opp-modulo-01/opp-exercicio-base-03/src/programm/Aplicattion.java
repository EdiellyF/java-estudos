package programm;
import entities.Student;
import java.util.Locale;
import java.util.Scanner;


public class Aplicattion {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Student estudante = new Student();

        System.out.print("Digite o nome do aluno");
        estudante.nome = sc.nextLine();

        System.out.println("Digite as três notas do aluno: ");
        estudante.n1 = sc.nextDouble();
        estudante.n2 = sc.nextDouble();
        estudante.n3 = sc.nextDouble();
    
        System.out.println("FINAL GRADE = " + estudante.calcularNotaAluno());


         if (estudante.calcularNotaAluno() < 60) {

             System.out.println("FAILED");
             System.out.println("MISSING " + estudante.missingPoints() );
        } else {
            System.out.println("PASS");
        }
    
    }

}