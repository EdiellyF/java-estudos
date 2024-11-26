package entities;

public class PessoaFisica extends Pessoa {

    private Double gastosComSaude;

    public PessoaFisica(String nome, Double renda, Double gastosComSaude) {
        super(nome, renda);
        setGastosComSaude(gastosComSaude);
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double calcularImposto() {
        double RendacomImpostos;
        if (getRenda() < 20000.00) {
            RendacomImpostos = getRenda() * 0.15;
        } else {
            RendacomImpostos = getRenda() * 0.25;
        }

        if (getGastosComSaude() > 0.0) {
            double deducaoSaude = this.getGastosComSaude() * 0.50;
            RendacomImpostos -= deducaoSaude;
        }

        return RendacomImpostos < 0 ? 0 : RendacomImpostos;
    }
}
