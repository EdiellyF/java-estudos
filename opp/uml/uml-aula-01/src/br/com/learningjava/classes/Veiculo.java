package br.com.learningjava.classes;

import br.com.learningjava.excecoes.*;
import br.com.learningjava.interfaces.VeiculoInterface;

public abstract class Veiculo implements VeiculoInterface {
    private String nome;
    private String marca ;
    private String chassi;
    protected int quantidadeRodas;
    private float quantidadeCombustivel;
    private Boolean ligado;
    protected float velocidade;

    public Veiculo() {
    	this.ligado = false;
    	this.velocidade = 0;
    }
    
    
    
    
    
    public float getVelocidade() {
		return velocidade;
	}




	public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return this.chassi;
    }

    public void setChassi(String chassi) throws ChassiInvalidoException {
        if (chassi == null || chassi.length() != 6) {
            throw new ChassiInvalidoException(chassi);
        }
        this.chassi = chassi;
    }
    

    public int getQuantidadeRodas() {
        return this.quantidadeRodas;
    }

    public float getQuantidadeCombustivel() {
        return this.quantidadeCombustivel;
    }

    public Boolean isLigado() {
        return ligado;
	}

	public void setQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }




    public void ligar(){
    	this.ligado = true;
    	this.velocidade = 0;

    }

    public void desligar(){
    	this.ligado = false;
    	this.velocidade = 0;
    	System.out.println("o veiculo desligou!");
    }



    public final void abastecer(float litros) throws AbastecimentoVeiculoLigadoException {
        if (!this.ligado) {
            quantidadeCombustivel += litros;    
        } else {
            throw new AbastecimentoVeiculoLigadoException("Não é permitido abastecer o veículo enquanto ele está ligado.");
        }
    }
    
    
    public void acelerar() throws AceleracaoVeiculoLigadoException {
    	if(this.ligado){
            this.velocidade += 10;
        } else {
            throw new AceleracaoVeiculoLigadoException();
        }

    }

    public void frear () throws FrenagemVeiculo {
        if(this.ligado){
            this.velocidade -= 10;
        }else {
            throw new FrenagemVeiculo();
        }
    }

    public abstract void preparar();
}
