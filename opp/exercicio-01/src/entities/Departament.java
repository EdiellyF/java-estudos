package entities;

public class Departament {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departament(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
