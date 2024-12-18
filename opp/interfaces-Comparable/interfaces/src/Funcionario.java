public class Funcionario implements Comparable<Funcionario> {
    private String nome;
    private double salary;


    public Funcionario(String nome, double salary) {
        this.nome = nome;
        this.salary = salary;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = Double.parseDouble(salary);
    }

    @Override
    public int compareTo(Funcionario other) {
        return this.nome.compareTo(other.getNome());
    }
}
