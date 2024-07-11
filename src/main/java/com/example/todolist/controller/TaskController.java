package com.example.todolist.controller;

import com.example.todolist.model.TaskModel;
import com.example.todolist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping
    public ArrayList<TaskModel> getAllTask() {
    return this.taskService.getAllTask();
    }



    @GetMapping (path = "{/id}")
    public Optional<TaskModel> getById(@PathVariable("id") Long id) {
    return this.taskService.getById(id);
    }

    @PostMapping
    public TaskModel saveTask(TaskModel task){
    return this.taskService.saveTask(task);
    }

    @PutMapping
    public TaskModel updateTaskById(@RequestBody TaskModel request, Long id){
        return this.taskService.updateTask(request,id);
    }

}
