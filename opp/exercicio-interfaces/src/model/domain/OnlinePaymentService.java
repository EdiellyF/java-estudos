package model.domain;

public interface OnlinePaymentService {
    Double interest(Double amount, Integer months);
    Double paymentFee(Double amount);

}
