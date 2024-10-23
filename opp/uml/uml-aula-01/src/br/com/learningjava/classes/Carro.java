package br.com.learningjava.classes;

public class Carro extends Veiculo {

	private int quantidadePortas;

	public int getQuantidadePortas() {
		return this.quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}


	public Carro() {
        this.quantidadeRodas = 4;
	}

	@Override
	public void preparar() {
		System.out.println("Coloque o cinto de segurança!");
	}

	public Carro(String nome, String marca) {
		this.quantidadeRodas = 4;
		this.setMarca(marca);
		this.setNome(nome);
	}
}
