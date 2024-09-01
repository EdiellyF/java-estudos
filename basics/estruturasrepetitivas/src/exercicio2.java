import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Digite um valor:");
        int N = sc.nextInt();
        int out = 0;
        int in = 0;

        for(int i=1; i <= N; i++){
           int x = sc.nextInt();

            if( x >= 10 && x <= 20){
               in = in + 1;
            }else {
                out = out + 1;
            }


        }


        System.out.println(in +" in");
        System.out.println(out +" out");

        sc.close();

    }
}
