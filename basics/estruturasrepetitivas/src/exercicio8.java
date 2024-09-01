
import java.util.Scanner;

public class exercicio8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro!");
        int N = sc.nextInt();

        for (int i=1; i <= N; i++) {
            if( N % i == 0 ){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
