package com.Learning.Learning;

import com.Learning.Learning.DesignPattern.Creational.Builder.Teacher;
import com.Learning.Learning.DesignPattern.Creational.Factory.Shape;
import com.Learning.Learning.DesignPattern.Creational.Factory.ShapeFactory;
import com.Learning.Learning.DesignPattern.Creational.Prototype.Parent;
import com.Learning.Learning.DesignPattern.Creational.Prototype.Student;
import com.Learning.Learning.DesignPattern.Structural.Decorator.*;
import com.Learning.Learning.DesignPattern.Structural.Proxy.CommandRunner;
import com.Learning.Learning.DesignPattern.Structural.Proxy.CommandRunnerProxy;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class LearningApplication {
    private final AddNewKPI addNewKPI;
    public static void main(String[] args) {
        SpringApplication.run(LearningApplication.class, args);
       /* Parent parent = new Parent("Seenivasan", "Virutha");
        Student student = new Student(1,"Nambi","seenivasanv50@gmail.com",9952203331L, parent);
        System.out.println(student);
        Student clone = (Student) student.clone();
        System.out.println(clone);
        System.out.println(student.equals(clone));
        System.out.println(parent.equals(clone.getParent()));
        Shape circle = ShapeFactory.getShape("CIRCLE");
        Shape triangle = ShapeFactory.getShape("TRIANGLE");
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        circle.draw();
        triangle.draw();
        rectangle.draw();

        Teacher teacher = Teacher.builder().name("Nambi").dept("CSE").phoneNo(9952203331L).build();
        Teacher teacher1 = Teacher.builder().name("Nambi").dept("CSE").phoneNo(9952203331L).build();

        Burger burger = new VegBurger();
        System.out.println(burger.getCost() + " : "+burger.getDescription());
        burger = new ExtraCheese(burger);
        System.out.println(burger.getCost() + " : "+burger.getDescription());
        burger = new ExtraToppings(burger);
        System.out.println(burger.getCost() + " : "+burger.getDescription());
        burger = new ChickenBurger();
        System.out.println(burger.getCost() + " : "+burger.getDescription());
        burger = new ExtraCheese(burger);
        burger = new ExtraCheese(burger);
        System.out.println(burger.getCost() + " : "+burger.getDescription());
        burger = new ExtraToppings(burger);
        burger = new ExtraToppings(burger);
        System.out.println(burger.getCost() + " : "+burger.getDescription());

        CommandRunner commandRunner = new CommandRunnerProxy("Admin","1234");
        CommandRunner commandRunner1 = new CommandRunnerProxy("qwewqw","1234");
        commandRunner.runCommand("rm -rf");
        commandRunner1.runCommand("rm -rf");*/
    }
}
