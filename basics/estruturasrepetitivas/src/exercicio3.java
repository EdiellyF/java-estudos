

import java.util.Scanner; 

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          System.out.println("Digite um valor:");
          int N = sc.nextInt();

          System.out.println("-------------");
            for(int i=1; i<=N; i++){
              Double v1 = sc.nextDouble();

              Double v2 = sc.nextDouble();

              if(v2 == 0){
                System.out.println("divisao impossivel ");
              }else {
                System.out.println(v1/v2);
              }

            }
         sc.close();
    }
}
