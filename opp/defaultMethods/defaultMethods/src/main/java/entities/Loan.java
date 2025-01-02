package entities;

import interfaces.services.InterestService;

import java.io.Serializable;
import java.security.InvalidParameterException;

public class Loan  {
    private Double amount;
    private Integer months;
    private InterestService interestService;

    public Loan(Double amount, Integer months, InterestService interestService) {
        if (months < 1 || months > 12) {
            throw new InvalidParameterException("Months must be between 1 and 12");
        }
        setAmount(amount);
        setMonths(months);
        this.interestService = interestService;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }

    public Double getInterestService() {
        return this.interestService.payment(amount, months);
    }


}
