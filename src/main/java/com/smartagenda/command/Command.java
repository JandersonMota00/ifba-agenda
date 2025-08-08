package com.smartagenda.command;

// Interface que define a estrutura de um comando, permitindo a execução, agendamento e desfazer. 
public interface Command {
    void execute();
    void undo(); // Exemplo de funcionalidade extra, útil para o Padrão Command.
}