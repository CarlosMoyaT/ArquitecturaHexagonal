package com.hexagonal.todolist.domain.ports.in;

public interface DeleteTaskUseCase {
    boolean deleteTask(Long id);
}
