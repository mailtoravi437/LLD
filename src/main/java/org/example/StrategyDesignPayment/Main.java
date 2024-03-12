package org.example.StrategyDesignPayment;

public class Main {
    public static void main(String[] args){
        PaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy("12345","112","112");
        PaymentStrategy payCardPaymentStrategy = new PaypalPaymentStrategy("12345","112");

        PaymentProcessor processor = new PaymentProcessor(creditCardPaymentStrategy);
        processor.processPayment(100.00);
    }
}
