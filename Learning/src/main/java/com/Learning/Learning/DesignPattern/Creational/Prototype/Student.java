package com.Learning.Learning.DesignPattern.Creational.Prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Prototype {
    private int id;
    private String name;
    private String email;
    private long phoneNo;
    private Parent parent;

    @Override
    public Prototype clone() {
        return new Student(id,name,email,phoneNo,(Parent) parent.clone());
    }
}
