package com.hexagonal.todolist.application.usecases;

import com.hexagonal.todolist.domain.model.AdditionalTaskInfo;
import com.hexagonal.todolist.domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl implements com.hexagonal.todolist.domain.ports.in.GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }
}
