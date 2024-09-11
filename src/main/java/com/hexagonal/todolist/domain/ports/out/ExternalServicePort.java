package com.hexagonal.todolist.domain.ports.out;

import com.hexagonal.todolist.domain.model.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
