import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        String nome;
        int idade;
        double altura;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int num_pessoa = sc.nextInt();

        Pessoa[] vetorPessoas = new Pessoa[num_pessoa];

        for (int i = 0; i < vetorPessoas.length; i++ ){
              System.out.println("Dados da " +  (i+1) + " pessoa:");
              System.out.print("Nome:");
              nome = sc.next();
              System.out.print("Idade:");
              idade = sc.nextInt();
              System.out.print("altura:");
              altura = sc.nextDouble();

              vetorPessoas[i] = new Pessoa(nome, idade, altura);
        }

             double alturaMedia = 0;

        ArrayList<Pessoa> menoresQue16 = new ArrayList<Pessoa>();

        for (int i = 0; i < vetorPessoas.length; i++){
            alturaMedia += vetorPessoas[i].getAltura();

            if (vetorPessoas[i].getIdade() < 16 ){
                menoresQue16.add(vetorPessoas[i]);
            }
        }

        alturaMedia = alturaMedia / vetorPessoas.length;

        System.out.println("Altura média: " + alturaMedia);

        if (!menoresQue16.isEmpty()){
            System.out.println("Pessoas com menos de 16 anos: " + menoresQue16.size() * 100.00 / vetorPessoas.length + "%");
            for (Pessoa p : menoresQue16){
                System.out.println(p.getNome());
            }
        }






    }


}