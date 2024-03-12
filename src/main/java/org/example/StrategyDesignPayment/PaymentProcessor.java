package org.example.StrategyDesignPayment;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;
    PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount){
        paymentStrategy.processPayment(amount);
    }
}
