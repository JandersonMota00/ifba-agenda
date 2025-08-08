package br.com.observer;

import br.com.models.Tarefa;

import java.util.ArrayList;
import java.util.List;

// Essa classe é responsável por emitir o aviso de que uma nova tarefa foi criada, quem
// recebe esse comunicado são os observers
public class AgendaTarefas {
    private List<Observer> observers = new ArrayList<>();
    private List<Tarefa> tarefas = new ArrayList<>();

    // Método responsável por adicionar os observers na lista de observers, ou seja,
    // quando uma tarefa for salva, será enviado o aviso somente para os observers que
    // foram salvos a partir desse método
    public void adicionarObserver(Observer observer) {
        this.observers.add(observer);
    }

    // Método que adiciona a tarefa na agenda e envia o aviso para os observers
    public void adicionarTarefa(Tarefa tarefa) {
        System.out.println("\nAGENDA: adicionando tarefa: " + tarefa.getNome());
        this.tarefas.add(tarefa);

        // Essa estrutura de repetição é para enviar o aviso para todos os observers salvos
        for (Observer observer : observers) {
            observer.update(tarefa);
        }

        tarefa.executar();
    }
}
