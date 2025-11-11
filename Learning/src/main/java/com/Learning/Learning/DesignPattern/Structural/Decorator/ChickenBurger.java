package com.Learning.Learning.DesignPattern.Structural.Decorator;

public class ChickenBurger implements Burger{
    @Override
    public int getCost() {
        return 180;
    }

    @Override
    public String getDescription() {
        return "Chicken Burger";
    }
}
