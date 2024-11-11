package entities;

import enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;


    private final List<OrderItem> itens = new ArrayList<>();

    private Client client;

   public Order() {
   }

   public Order(Date moment, OrderStatus status, Client client){
       setMoment(moment);
       setStatus(status);
       this.client = client;
   }


    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }


    public List<OrderItem> getItem() {
        return itens;
    }

    public void addItem(OrderItem item){
        itens.add(item);
    }

    public void removeItem(OrderItem item){
       itens.remove(item);
    }

    public Double total(){
       double sum =0.0;
       for(OrderItem it: itens){
           sum = sum + it.subTotal();
       }
       return sum;
    }


    @Override
    public String toString() {

       StringBuilder sb = new StringBuilder();

       sb.append("Order Moment: " + getMoment() + "\n");
       sb.append("Order Status: " + getStatus() + "\n");
       sb.append("Client: " + getClient() + "\n");

       itens.forEach( item -> sb.append(item.toString()));
       sb.append("TOTAL:" + total());

       return sb.toString();

    }
}
