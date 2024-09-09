package entities;

public class Produto {
    public  String name;
    public double price;
    public int quantity;

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

