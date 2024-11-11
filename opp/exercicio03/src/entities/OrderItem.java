package entities;

public class OrderItem {

    private int quantity;
    private Double price;

    private Product product;

    public OrderItem(int quantity, Product product) {
        setQuantity(quantity);
        setProduct(product);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal() {
        if (product != null && quantity > 0) {
            this.price = quantity * product.getPrice();
            return this.price;
        } else {
            // Caso algum valor não esteja definido ou quantity seja inválido
            return 0.0;
        }
    }


    @Override
    public String toString() {
        return
               product + ", Quantity: " +
                       getQuantity() +
                       ", Subtotal:" + this.subTotal() + "\n";
    }


}
