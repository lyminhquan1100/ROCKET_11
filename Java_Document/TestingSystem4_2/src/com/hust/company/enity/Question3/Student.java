package com.hust.company.enity.Question3;

public abstract class Student extends Person{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }
}
