package entities;

public abstract class Pessoa {
    private String nome;
    private Double renda;

    public Pessoa(String nome, Double renda) {
        setNome(nome);
        setRenda(renda);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public abstract Double calcularImposto();

    @Override
    public String toString() {
        return String.format("%s: $ %.2f", getNome(), calcularImposto());
    }
}
