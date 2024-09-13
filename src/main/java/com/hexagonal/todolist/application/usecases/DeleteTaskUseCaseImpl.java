package com.hexagonal.todolist.application.usecases;

import com.hexagonal.todolist.domain.ports.in.DeleteTaskUseCase;
import com.hexagonal.todolist.domain.ports.out.TaskRepositoryPort;

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public DeleteTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }


    @Override
    public boolean deleteTask(Long id) {
        return taskRepositoryPort.delenteById(id);
    }
}
