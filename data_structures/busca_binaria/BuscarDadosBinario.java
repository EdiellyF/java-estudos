
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class BuscarDadosBinario {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho da lista");
        int tamanho = sc.nextInt();

        System.out.println("Digite o limite da lista (intervalo)");
        int limite = sc.nextInt();
        List<Integer> lista_numeros = gerarLista(tamanho, limite);
        System.out.println("Qual item você deseja encontrar na lista:");
        int item = sc.nextInt();

        String resultado_encotrando = buscar(lista_numeros, item);
        System.out.println(resultado_encotrando);
        System.out.print(lista_numeros);


        sc.close();

    }

    public static List<Integer> gerarLista(int tamanho, int limite){
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            int numeroAleatorio = random.nextInt(limite); // Gera número entre 0 e limiteSuperior - 1
            lista.add(numeroAleatorio);
        }

         Collections.sort(lista);

         return lista;
    }

    public static String buscar(List<Integer> args, int item){
     int baixo = 0;
     int alto = args.size() - 1;

     while (baixo <= alto){
            int metade = ((baixo + alto)/2);
            if(args.get(metade) == item){
                return "Achei no índice " + metade;
            }else if(args.get(metade) < item){
                baixo = baixo + 1;
            }else {
                alto = alto - 1;
            }
    }
           return "Não achei";
        
     }

    

    


}
