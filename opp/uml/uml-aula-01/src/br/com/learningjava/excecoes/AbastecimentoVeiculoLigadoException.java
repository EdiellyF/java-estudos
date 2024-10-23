package br.com.learningjava.excecoes;

public class AbastecimentoVeiculoLigadoException extends  Exception {
    private static final long serialVersionUID = -9686277659L;
  
    public AbastecimentoVeiculoLigadoException(String mensagem) {
        super(String.format("ERRO", mensagem));  
    }
    
}