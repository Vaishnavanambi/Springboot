package com.Learning.Learning.DesignPattern.Creational.Factory;

public class ShapeFactory {
    public static Shape getShape(String shapeType){
        return switch (shapeType) {
            case "TRIANGLE" -> new Triangle();
            case "RECTANGLE" -> new Rectangle();
            default -> new Circle();
        };
    }
}
