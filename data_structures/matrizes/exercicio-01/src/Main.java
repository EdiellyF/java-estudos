import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for(int i=0; i < matriz.length; i++ ){
            for(int j =0; j < matriz[i].length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal Principal:");
        for(int i=0; i < matriz.length; i++ ){
            System.out.print(matriz[i][i] + " ");
        }

        int count =0;

        System.out.print("Negative Numbers: ");
        for(int i=0; i < matriz.length; i++ ){
            for(int j =0; j < matriz[i].length; j++){
                if(matriz[i][j] < 0){
                   count++;
                }

            }
        }

        System.out.println(count);





    }
}
