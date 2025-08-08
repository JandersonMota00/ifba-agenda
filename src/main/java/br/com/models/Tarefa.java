package br.com.models;

import br.com.command.Command;
import br.com.strategy.Strategy;

// Model seguindo o que foi solicitado na atividade, onde optamos por definir somente o nome da Tarefa,
// além do Command e Strategy
public class Tarefa {
    private String nome;
    private Command comando;
    private Strategy estrategia;

    public Tarefa(String nome, Command comando, Strategy estrategia) {
        this.nome = nome;
        this.comando = comando;
        this.estrategia = estrategia;
    }

    public String getNome() {
        return nome;
    }

    public Command getComando() {
        return comando;
    }

    public void executar() {
        this.estrategia.executar(this.comando);
    }
}
