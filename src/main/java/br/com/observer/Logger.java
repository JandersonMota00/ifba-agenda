package br.com.observer;

import br.com.models.Tarefa;

// Essa classe implementa a interface observer, implementado a lógica do método update
public class Logger implements Observer {

    // Método que executa o envio do aviso, a partir da lógica estabelecida
    @Override
    public void update(Tarefa tarefa) {
        System.out.println("Tarefa " + tarefa.getNome() + " criada!");
    }
}