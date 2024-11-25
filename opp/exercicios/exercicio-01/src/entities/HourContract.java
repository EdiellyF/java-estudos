package entities;

import java.time.LocalDate;
import java.util.Date;

public class HourContract {
    private Date date;
    private int hour;
    private double valuePerHour;
    private  Departament departament;

    public HourContract() {}

    public HourContract(Date data, double valorPorHora, int duracao) {
        this.setDate(data);
        this.setValuePerHour(valorPorHora);
        this.setHour(duracao);

    }




    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }



    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double totalValue(){
        return valuePerHour * hour;
    }
}
