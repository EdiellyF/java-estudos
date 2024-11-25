package entities;

public class Employee {
    private String name;
    private Integer Hours;
    private Double valuePerHour;

    public Employee (String name, Integer hours, Double valuePerHour){
        setName(name);
        setHours(hours);
        setValuePerHour(valuePerHour);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double valuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return Hours;
    }

    public void setHours(Integer hours) {
        Hours = hours;
    }


    public Double payment(){
        return valuePerHour * Hours;
    }

    @Override
    public String toString() {
        return getName() + " - " + payment();
    }
}
