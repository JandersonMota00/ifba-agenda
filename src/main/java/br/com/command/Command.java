package br.com.command;

// Essa interface serve para definir os métodos necessários para a execução do padrão de projeto Command
public interface Command {
    String getNomeCommand();
    // Esse método será utilizado para executar um Command, a partir da lógica estabelecida por quem implementar a classe
    void executar();
    // Esse método será utilizado para desfazer a execução de um Command, a partir da lógica estabelecida por quem implementar a classe
    void desfazer();
}
