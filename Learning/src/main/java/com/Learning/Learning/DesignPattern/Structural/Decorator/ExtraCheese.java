package com.Learning.Learning.DesignPattern.Structural.Decorator;

public class ExtraCheese implements BurgerDecorator{
    private final Burger burger;
    public ExtraCheese(Burger burger) {
        this.burger = burger;
    }
    @Override
    public int getCost() {
        return burger.getCost()+10;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+" with extra cheese";
    }
}
