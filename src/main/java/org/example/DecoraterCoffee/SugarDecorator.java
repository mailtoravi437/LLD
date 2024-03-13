package org.example.DecoraterCoffee;

public class SugarDecorator extends CoffeeDecorator{

    SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost()+100;
    }

    @Override
    public String description() {
        return super.description()+"Sugar";
    }
}
