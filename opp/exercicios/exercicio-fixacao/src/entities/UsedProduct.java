package entities;

import java.time.LocalDate;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    @Override
    public String priceTag(){
        return super.getName() + " (used)  $ " + super.getPrice() + " (Manufacture date: " + getManufactureDate() + ")";
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.setManufactureDate(manufactureDate);
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
