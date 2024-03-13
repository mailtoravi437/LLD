package org.example.DecoraterCoffee;

public class SimpleCoffee implements Coffee{

    @Override
    public double cost() {
        return 1.0;
    }

    @Override
    public String description() {
        return "Simple Coffee";
    }
}
