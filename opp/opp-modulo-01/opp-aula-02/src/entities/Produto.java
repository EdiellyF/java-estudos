package entities;

public class Produto {
   private String name;
   private double price;
   private int quantity;

    public Produto( String name, double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Produto( String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }


    public int getQuantity(){
        return quantity;
    }

    public double TotalValueStock(){
        return this.quantity * price;
    }

    public void addProducts(int quantidade){
        this.quantity += quantidade;
    }


    public void removeProducts(int quantidade){
        this.quantity = this.quantity - quantidade;
    }

    public String toString(){
        return name
        + ", $ " 
        + String.format("%.2f", price) + 
        ", " +
        quantity +
        " units, Total: "
        + String.format("%.2f",TotalValueStock());
    }
}

