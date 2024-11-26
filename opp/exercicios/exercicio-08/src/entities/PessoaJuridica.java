package entities;

public class PessoaJuridica extends Pessoa{
    private int numeroFuncionarios;

    public PessoaJuridica(String nome, Double renda, int NumeroFuncionarios) {
        super(nome, renda);
        this.setNumeroFuncionarios(NumeroFuncionarios);
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double calcularImposto() {
        double impostosTotal;
        if (getNumeroFuncionarios() > 10) {
            impostosTotal = getRenda() * 0.14;
        } else {
            impostosTotal = getRenda() * 0.16;
        }
        return impostosTotal < 0 ? 0 : impostosTotal;
    }
}
