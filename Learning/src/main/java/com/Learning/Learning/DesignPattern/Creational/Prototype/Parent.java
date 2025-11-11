package com.Learning.Learning.DesignPattern.Creational.Prototype;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Parent implements Prototype {
    private String fatherName;
    private String motherName;

    @Override
    public Prototype clone() {
        return new Parent(fatherName,motherName);
    }
}
