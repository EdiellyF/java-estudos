package entities;

public class Product {
    private String name;
    private Double price;


    public Product() {}


    public Product(String name, Double price) {
        this.setName(name);
        this.setPrice(price);
    }

    public String priceTag(){
        return getName() + " $ " + getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
