package interfaces.services;

public interface InterestService {

    double getInterestRate();

    default Double payment(double amount, int months){
        double interestRate = this.getInterestRate();
        return amount * Math.pow(( 1 + getInterestRate() / 100), months);
    }


}
