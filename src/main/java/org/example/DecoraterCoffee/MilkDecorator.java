package org.example.DecoraterCoffee;

public class MilkDecorator extends CoffeeDecorator{

    MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost()+10;
    }

    @Override
    public String description() {
        return super.description()+"MilkDecorator";
    }
}
