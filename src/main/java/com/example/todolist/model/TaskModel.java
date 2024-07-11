package com.example.todolist.model;

import jakarta.persistence.*;

import java.util.Date;
//AGREGAR STATUS
@Entity
public class TaskModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private Date limitDate;
    private String title;
    private String description;

    public TaskModel(){

    }
    public TaskModel(Long id, Date limitDate, String title, String description) {
        this.id = id;
        this.limitDate = limitDate;
        this.title = title;
        this.description=description;
    }
    public TaskModel(Long id, Date limitDate, String title) {
        this.id = id;
        this.limitDate = limitDate;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(Date limitDate) {
        this.limitDate = limitDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
