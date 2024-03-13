package org.example.DecoraterCoffee;

abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee;

    CoffeeDecorator(Coffee decoratedCoffee){
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }

    @Override
    public String description() {
        return decoratedCoffee.description();
    }
}
