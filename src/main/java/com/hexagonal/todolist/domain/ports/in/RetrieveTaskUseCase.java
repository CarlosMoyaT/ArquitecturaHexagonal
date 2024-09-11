package com.hexagonal.todolist.domain.ports.in;

import com.hexagonal.todolist.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional<Task> getTask(Long id);
    List<Task> getAllTasks();
}
