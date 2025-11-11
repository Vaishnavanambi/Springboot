package com.Learning.Learning.DesignPattern.Structural.Decorator;

public class VegBurger implements Burger{
    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Veg Burger";
    }
}
