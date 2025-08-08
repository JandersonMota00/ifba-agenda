package com.smartagenda.model;

import com.smartagenda.command.Command;
import com.smartagenda.observer.Observer;
import com.smartagenda.observer.Subject;
import com.smartagenda.strategy.ExecutionStrategy;

import java.util.ArrayList;
import java.util.List;

// O agendador de tarefas atua como o 'Subject' no padrão Observer. 
public class TaskScheduler implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    // Adiciona uma nova tarefa e notifica todos os observadores.
    public void scheduleTask(String taskName, Command command, ExecutionStrategy strategy) {
        Task newTask = new Task(taskName, command);
        System.out.println("\nAgendando nova tarefa: " + newTask.getNome());
        // Notifica todos os observadores que uma nova tarefa foi criada. 
        notifyObservers("Nova tarefa criada: " + newTask.getNome());
        // Executa a tarefa usando a estratégia definida. 
        strategy.execute(command);
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}