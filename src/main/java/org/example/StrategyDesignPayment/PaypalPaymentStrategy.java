package org.example.StrategyDesignPayment;

public class PaypalPaymentStrategy implements PaymentStrategy{
    private String email;
    private String password;

    PaypalPaymentStrategy(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("PaypalPaymentStrategy.processPayment"+amount);
    }
}
