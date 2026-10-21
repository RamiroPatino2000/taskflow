package com.ramiro.taskflow.model;

//Clase para manejar Task
public class Task {

    private int id = 0;
    public String name = "none";

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
