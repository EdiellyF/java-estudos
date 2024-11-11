package entities;

public class Funcionario {

    private String name;
    private int id;
    private double salario;

    public Funcionario(int id, String name, double salario ) {
        this.id = id ;
        setName(name);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void AumentarSalario( double porcetagem) {
        salario += ((porcetagem/100)  * salario);
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salario);
    }


}
