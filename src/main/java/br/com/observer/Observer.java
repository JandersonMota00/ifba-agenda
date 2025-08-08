package br.com.observer;

import br.com.models.Tarefa;

// Essa interface serve para definir os métodos necessários para a execução do padrão de projeto Command
public interface Observer {
    // Quem implementar essa classe, vai aplicar a lógica especifica para o envio do aviso, a partir desse método
    void update(Tarefa tarefa);
}