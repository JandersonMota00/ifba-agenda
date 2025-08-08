package com.smartagenda.strategy;

import com.smartagenda.command.Command;

// Estratégia que executa o comando imediatamente. 
public class ExecucaoImediataStrategy implements ExecutionStrategy {
    @Override
    public void execute(Command command) {
        System.out.println("Estratégia: Executando tarefa imediatamente.");
        command.execute();
    }
}