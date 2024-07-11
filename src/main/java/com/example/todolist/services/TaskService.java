package com.example.todolist.services;

import com.example.todolist.model.TaskModel;
import com.example.todolist.repositories.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    ITaskRepository taskRepository;

    public ArrayList<TaskModel> getAllTask(){
        return (ArrayList<TaskModel>) taskRepository.findAll();
    }

    public Optional<TaskModel> getById(Long id){
        return taskRepository.findById(id);
    }

    public TaskModel saveTask(TaskModel task){
        return taskRepository.save(task);
    }

    public TaskModel updateTask(TaskModel request, Long id){
        TaskModel task = this.taskRepository.findById(id).get();
        task.setDescription(request.getDescription());
        task.setTitle(request.getTitle());
        task.setLimitDate(request.getLimitDate());
        return task;
    }


}
