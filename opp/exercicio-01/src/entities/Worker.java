package entities;

import enums.WorkerLevelEnums;
import entities.HourContract;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String nome;
    private WorkerLevelEnums level;
    private double baseSalary;

    //ASSOCIAÇÕES
    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String nome, WorkerLevelEnums level, double baseSalary, Departament departament){
        this.setNome(nome);
        this.setLevel(level);
        this.setBaseSalary(baseSalary);
        this.setDepartament(departament);
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevelEnums getLevel() {
        return level;
    }

    public void setLevel(WorkerLevelEnums level) {
        this.level = level;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addContract(HourContract contract){
        this.contracts.add(contract);
        //refere-se a propria classe, a lista dos contratos
    }
    public void removeContract(HourContract contract){
        this.contracts.remove(contract);
        //remove os contratos da lista
    }

    public double income(int year, int month) {
        double soma = baseSalary;
        Calendar cal = Calendar.getInstance();

        // Itera sobre todos os contratos
        for (HourContract c : contracts) {
            // Define a data do calendário para a data do contrato
            cal.setTime(c.getDate());

            int c_year = cal.get(Calendar.YEAR);      // Ano do contrato
            int c_month = 1 + cal.get(Calendar.MONTH); // Mês do contrato, ajustado para 1-12

            // Se o ano e mês do contrato coincidem com o especificado
            if (year == c_year && month == c_month) {
                soma += c.totalValue();
            }
        }
        return soma;
    }



}
