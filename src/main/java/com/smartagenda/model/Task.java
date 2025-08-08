package com.smartagenda.model;

import com.smartagenda.command.Command;

// Classe que representa a tarefa, encapsulando o comando e a estratégia.
public class Task {
    private final String nome;
    private final Command command;

    public Task(String nome, Command command) {
        this.nome = nome;
        this.command = command;
    }

    public String getNome() {
        return nome;
    }

    public Command getCommand() {
        return command;
    }
}