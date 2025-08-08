package com.smartagenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.smartagenda.command.EnviarEmailCommand;
import com.smartagenda.model.TaskScheduler;
import com.smartagenda.observer.LoggerObserver;
import com.smartagenda.observer.NotificadorObserver;
import com.smartagenda.strategy.ExecucaoImediataStrategy;

@SpringBootApplication
public class AgendaApplication {

	public static void main(String[] args) {
		TaskScheduler scheduler = new TaskScheduler();

        // 1. Instanciar e registrar os observers.
        scheduler.registerObserver(new LoggerObserver());
        scheduler.registerObserver(new NotificadorObserver());

        // 2. Criar comandos específicos.
        EnviarEmailCommand emailCommand = new EnviarEmailCommand("usuario@exemplo.com", "Lembrete", "Não se esqueça da reunião!");
        
        // 3. Criar uma estratégia de execução.
        ExecucaoImediataStrategy imediataStrategy = new ExecucaoImediataStrategy();
        
        // 4. Agendar a tarefa, que irá notificar os observadores e executar o comando usando a estratégia.
        scheduler.scheduleTask("Enviar Lembrete de Reunião", emailCommand, imediataStrategy);
	}

}
