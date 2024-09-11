package com.hexagonal.todolist.domain.ports.in;

import com.hexagonal.todolist.domain.model.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
