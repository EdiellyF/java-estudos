package model.entities;

import model.exceptions.DomainException;

public class Account {
    private Integer number;
    private String Holder;
    private Double balance;
    private Double withdrawLimit;



    public Account(Integer number, String Holder, Double balance, Double withdrawLimit) {
        setNumber(number);
        setHolder(Holder);
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    //gets e sets
    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return Holder;
    }

    public void setHolder(String holder) {
        Holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    //metodos
    public void withdraw(Double amount) throws DomainException {
        if(amount > getWithdrawLimit()){
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
        } if (getBalance() == 0.0 || amount > getBalance()){
            throw new DomainException("Withdraw error: Not enough balance");
        }
        balance -= amount;
    }

    public void deposit(Double amount) throws DomainException {
        if (amount == 0.0){
            throw new DomainException("The deposit amount must be greater than zero.");
        }
        balance += amount;
    }

}
