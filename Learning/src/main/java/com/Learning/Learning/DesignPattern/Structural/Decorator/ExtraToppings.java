package com.Learning.Learning.DesignPattern.Structural.Decorator;

public class ExtraToppings implements BurgerDecorator{
    private final Burger burger;
    public ExtraToppings(Burger burger) {
        this.burger = burger;
    }
    @Override
    public int getCost() {
        return burger.getCost()+15;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+" with extra toppings";
    }
}
