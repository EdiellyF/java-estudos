
import java.util.Scanner;

public class exercicio1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

      int num1 = sc.nextInt();
      int  num2 = sc.nextInt();
      int  num3 = sc.nextInt();

      int higher = max(num1,num2, num3);
      System.out.println("é o maior " + higher);
     
      sc.close();

    }

    public static int max(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else {
          if(num2 > num3){
            return num2;
          }else {
              return num3;
          }
        }
  
    }
}
