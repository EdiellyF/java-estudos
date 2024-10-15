import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Digite uma messagem: ");
//        String message = sc.next();
//        System.out.println(message);
         System.out.println("Digite o primeiro numero: ");
         int num = Integer.parseInt(sc.nextLine());
         System.out.print("Digite a operação:");
         char operacao = sc.next().charAt(0);
         System.out.print("Digite o segundo número:");
         int numero2 = sc.nextInt();
         System.out.print(String.format("Voce quer fazer a operação %d %c %d", num, operacao, numero2 ));




        sc.close();

    }
}