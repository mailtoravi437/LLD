package org.example.StrategyDesignPayment;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    CreditCardPaymentStrategy(String cardNumber, String expiryDate,String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit Cardpayment"+amount);
    }
}
