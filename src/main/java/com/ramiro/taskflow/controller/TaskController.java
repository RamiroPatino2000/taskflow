package com.ramiro.taskflow.controller;
import com.ramiro.taskflow.model.Task;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController 
public class TaskController {
    
    @GetMapping("task")
    public List<Task> getTasks() {

        //Crea lista dinamica de task
        List<Task> tasks = List.of(
            new Task(1, "API REST Java"), 
            new Task(2, "CRUD Java")
        );

        //Devuelve lista de taks
        return tasks;

    }
}
