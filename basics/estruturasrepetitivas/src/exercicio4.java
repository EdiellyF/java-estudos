
import java.util.Scanner;

public class exercicio4 {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Digite um valor para o fatorial:");
       int N = sc.nextInt();

       int soma = 1;

       for(int i = 1; i <= N; i++ ){
            soma = soma * i;

       }
       System.out.println(soma);

   }  
}
