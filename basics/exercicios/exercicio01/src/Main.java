import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro ");
        int n = sc.nextInt();


        double[] alturasPessoas = new double[n];
        double media = 0;

        for (int i = 0; i < alturasPessoas.length; i++) {
            System.out.print("Digite a altura do pessoa " + (i + 1) + ":");
            alturasPessoas[i] = sc.nextDouble();

            media += alturasPessoas[i];








        }

        media /= alturasPessoas.length;

        System.out.println(media);
    }
}