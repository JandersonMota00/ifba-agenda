package br.com.strategy;

import br.com.command.Command;

// Essa interface serve para definir os métodos necessários para a execução do padrão de projeto Command
public interface Strategy {
    // Esse método vai ter a lógica da estratégia que implementar essa classe
    void executar(Command comando);
}
