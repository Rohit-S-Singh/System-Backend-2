// this file handles all the logic basically a controller in case of
// springBoot java

package com.example.demo.service;

import com.example.demo.entity.Task;
import com.example.demo.repository.TodoEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoEntry newTodoEntry;

    public void saveTask(Task newTask){
        newTodoEntry.insert(newTask);
    }

    public List<Task> getAll(){
        return newTodoEntry.findAll();
    }

    public Optional<Task> findById(String id){
        return newTodoEntry.findById(id);
    }

}