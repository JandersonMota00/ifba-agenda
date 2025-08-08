package br.com.strategy;

import br.com.command.Command;

// Essa classe implementa a interface e aplica a lógica do método executar
public class StrategyPosterior implements Strategy {
    @Override
    public void executar(Command comando) {
        System.out.println("STRATEGY POSTERIOR: execução posterior!");
    }
}
