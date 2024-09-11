package com.hexagonal.todolist.domain.ports.in;

import com.hexagonal.todolist.domain.model.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
