package com.hexagonal.todolist.application.usecases;

import com.hexagonal.todolist.domain.model.Task;
import com.hexagonal.todolist.domain.ports.in.CreateTaskUseCase;
import com.hexagonal.todolist.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
