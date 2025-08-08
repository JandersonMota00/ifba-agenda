package com.smartagenda.strategy;

import com.smartagenda.command.Command;

// Interface para definir a estratégia de execução de uma tarefa. 
public interface ExecutionStrategy {
    void execute(Command command);
}