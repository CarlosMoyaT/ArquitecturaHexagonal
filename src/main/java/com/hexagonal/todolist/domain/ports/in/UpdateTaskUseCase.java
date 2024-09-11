package com.hexagonal.todolist.domain.ports.in;

import com.hexagonal.todolist.domain.model.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updateTask);
}
