package entities;

public class OutsourcedEmployee extends  Employee {

    private Double additionalCharge;

    @Override
    public Double payment(){
        return getHours() * valuePerHour() + (110/100 * additionalCharge);
    }

}
