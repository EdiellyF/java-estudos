import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int N = sc.nextInt();
        if(N < 1 && N> 1000){
            System.out.println("Impossivel");
        }else {
            for(int i=1; i<=N; i++){
                if(N % i != 0){
                    System.out.println(i);
                }
            }
        }


    }
}
