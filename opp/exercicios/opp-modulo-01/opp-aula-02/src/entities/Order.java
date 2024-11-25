package entities;

import java.util.Date;
import entities.Produto;

public class Order {
    private Date date;
    private Produto Produto;

    


    public Order(Date date, Produto Produto) {
        this.date = date;
        this.Produto = Produto;
        this.Produto.name = "TV";
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Produto getProduto() {
        return this.Produto;
    }

    public void setProduto(Produto Produto) {
        this.Produto = Produto;
    }


}
