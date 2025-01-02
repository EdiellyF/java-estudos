package entities;

import interfaces.services.InterestService;

public class BrazilInterestService implements InterestService {

    private  double interestRate;

    public BrazilInterestService() {
    }



    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }


    @Override
    public double getInterestRate() {
        return this.interestRate;
    }




}
