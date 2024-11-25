package entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super.setPrice(price);
        super.setName(name);
       setCustomsFee(customsFee);
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return super.getPrice() + customsFee;

    }

    @Override
    public String priceTag() {
        return  super.getName() + " $  " +  totalPrice() + " (Customs fee:) " + getCustomsFee();
    }

}
