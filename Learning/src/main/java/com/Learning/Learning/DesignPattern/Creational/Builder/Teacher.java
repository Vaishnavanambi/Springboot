package com.Learning.Learning.DesignPattern.Creational.Builder;

import lombok.AllArgsConstructor;

import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher {
    private int id;
    private String name;
    private String dept;
    private String qualification;
    private String email;
    private long phoneNo;
    private String address;

    public Teacher(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.dept = builder.dept;
        this.qualification = builder.qualification;
        this.email = builder.email;
        this.phoneNo = builder.phoneNo;
        this.address = builder.address;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private int id;
        private String name;
        private String dept;
        private String qualification;
        private String email;
        private long phoneNo;
        private String address;
        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder dept(String dept){
            this.dept = dept;
            return this;
        }
        public Builder qualification(String qualification){
            this.qualification = qualification;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Builder phoneNo(long phoneNo){
            this.phoneNo = phoneNo;
            return this;
        }
        public Builder address(String address){
            this.address=address;
            return this;
        }
        public Teacher build(){
            return new Teacher(this);
        }

    }
}
