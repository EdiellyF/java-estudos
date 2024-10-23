package br.com.learningjava.classes;

import br.com.learningjava.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.learningjava.excecoes.AceleracaoVeiculoLigadoException;
import br.com.learningjava.excecoes.FrenagemVeiculo;

public  final class Moto extends Veiculo {
	public Moto() {
		this.quantidadeRodas = 2;
	}
	public Moto(String nome, String marca) {
		this.quantidadeRodas = 2;
		this.setNome(nome);
		this.setMarca(marca);
	}

@Override
	public void acelerar() throws AceleracaoVeiculoLigadoException {
		if(this.isLigado()){
			this.velocidade = velocidade + 3;
		} else {
			throw new AceleracaoVeiculoLigadoException();
		}

	}

@Override
	public void frear () throws FrenagemVeiculo {
		if(this.isLigado()){
			this.velocidade -= 3;
		}else {
			throw new FrenagemVeiculo();
		}
	}

	@Override
	public void preparar() {
		System.out.print("Coloque o capacete");
	}

}
