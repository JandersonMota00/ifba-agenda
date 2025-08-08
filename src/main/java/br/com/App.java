package br.com;

import br.com.command.CommandEnviarEmail;
import br.com.command.CommandTocarAlarme;
import br.com.models.Tarefa;
import br.com.observer.AgendaTarefas;
import br.com.observer.InterfaceGrafica;
import br.com.observer.Logger;
import br.com.observer.Notificador;
import br.com.strategy.StrategyImediato;
import br.com.strategy.StrategyPosterior;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        AgendaTarefas agenda = new AgendaTarefas();

        Logger logger = new Logger();
        Notificador notificador = new Notificador();
        InterfaceGrafica interfaceGrafica = new InterfaceGrafica();
        agenda.adicionarObserver(logger);
        agenda.adicionarObserver(notificador);
        agenda.adicionarObserver(interfaceGrafica);

        StrategyImediato estrategiaImediata = new StrategyImediato();
        StrategyPosterior estrategiaPosterior = new StrategyPosterior();

        Tarefa tarefaEmail = new Tarefa("Lembrete de Reunião!", new CommandEnviarEmail("emailFicticio@gmail.com", "Lembrete de Reunião!"), estrategiaImediata);
        agenda.adicionarTarefa(tarefaEmail);

        Tarefa tarefaAlarme = new Tarefa("Alarme para Pausa!", new CommandTocarAlarme("Alarme para Pausa!"), estrategiaPosterior);
        agenda.adicionarTarefa(tarefaAlarme);

        System.out.println("\nSimulando o desfazer do Command!");
        tarefaEmail.getComando().desfazer();
    }
}
