package org.example.DecoraterCoffee;

public class Main {
    public static void main(String[] args){
        Coffee coffee = new SimpleCoffee();
        MilkDecorator milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.cost());

    }
}
