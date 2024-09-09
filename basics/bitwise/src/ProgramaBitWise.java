import java.util.Scanner;

public class ProgramaBitWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número: ");
        int n = sc.nextInt();
        
        System.out.print("Digite a máscara: ");
        int mask = sc.nextInt();

        boolean verificacaoMask = verificarBit(n, mask);
        System.out.println("Verificação da máscara: " + verificacaoMask);
    }

    public static boolean verificarBit(int numero, int mask) {
        // Realiza a operação bitwise AND e verifica se o resultado é diferente de 0
        return (numero & mask) != 0;
    }
}


