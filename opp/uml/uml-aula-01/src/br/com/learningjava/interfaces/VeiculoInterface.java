package br.com.learningjava.interfaces;

import br.com.learningjava.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.learningjava.excecoes.AceleracaoVeiculoLigadoException;

public interface VeiculoInterface {
	void ligar();
	void desligar();
	void acelerar() throws  AceleracaoVeiculoLigadoException;
	void abastecer() throws AbastecimentoVeiculoLigadoException;
	void preparar();
}
