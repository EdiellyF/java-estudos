package entities;

public class ContaBancaria {
    private int numConta;
    private String nomeTitular;
    private double valorConta;



    public ContaBancaria(int numConta, String nomeTitular) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
    }

    public ContaBancaria(int numConta, String nomeTitular, double primeiroDeposito) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        realizarDeposito(primeiroDeposito);
       
    }


    public int getNumConta() {
        return this.numConta;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getValorConta() {
        return this.valorConta;
    }

    public void realizarDeposito(double deposito){
        valorConta += deposito;
    }

    public void realizarSaque(double saque){
        valorConta = valorConta - saque - 5.00;
    }



    public String toString(){
        return 
                "Account "  + 
                getNumConta() + ", Holder: " 
                + getNomeTitular() + ", " 
                + "Balance " + getValorConta();
    }

}
