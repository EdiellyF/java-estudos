package br.com.learningjava.main;


import br.com.learningjava.classes.*;
import br.com.learningjava.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.learningjava.excecoes.ChassiInvalidoException;



public class Main {

    public static void main(String[] args) {
      

        try {
            
        
              Veiculo corsa = new Moto();
              corsa.ligar();
              System.out.println("Velocidade atual do veiculo:" + corsa.getVelocidade());
             corsa.acelerar();
             System.out.println("Velocidade atual do veiculo:" + corsa.getVelocidade());
             corsa.abastecer(10);
             corsa.setChassi("NOME");
         
        } catch(AbastecimentoVeiculoLigadoException e){
            System.out.println("VOCE NAO PODE ABASTECER ENQUANTO ESTIVER LIGADO");
        }
        catch(ChassiInvalidoException f){
          f.getMessage();
        } 
        catch (Exception e) {
            System.out.println("OCORREU UM ERRO " + e.getMessage());

        }
        

    }
}
