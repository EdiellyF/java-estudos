
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo!");
        int N = sc.nextInt();

        for(int i=1; i<= N; i++){
            System.out.println(i + " " + i*i + " " + i*i*i);
        }

        sc.close();


    }
}
