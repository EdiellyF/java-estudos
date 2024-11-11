package enums;

public enum OrderStatus {
    PENDING_PAYMENT(0),
    PROCESSING(10),
    SHIPPED(2),
    DELIVERED(3);


    private int description;

    OrderStatus(int i) {
        this.description = i;
    }

    public int getDescription(){
        return description;
    }

}
