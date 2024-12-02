package entities;

public class Item {
    private String Nome;
    private Double PrecoUnitario;
    private int Quantidade;

    public Item(String Nome, Double PrecoUnitario, int Quantidade) {
        setNome(Nome);
        setPrecoUnitario(PrecoUnitario);
        setQuantidade(Quantidade);
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Double getPrecoUnitario() {
        return PrecoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        PrecoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }


    public Double calculaPreco() {
        return PrecoUnitario * Quantidade;
    }

    @Override
    public String toString() {
        return
            Nome + ", " + calculaPreco();
    }
}
