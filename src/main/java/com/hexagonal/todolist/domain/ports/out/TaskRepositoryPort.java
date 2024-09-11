package com.hexagonal.todolist.domain.ports.out;

import com.hexagonal.todolist.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort {
    Task save(Task task);
    Optional<Task> findById(Long id);
    List<Task> findAll();
    Optional<Task> update(Task task);
    boolean delenteById(Long id);
}
