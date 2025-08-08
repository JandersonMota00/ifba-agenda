package com.smartagenda.command;

// Implementação concreta de um comando para enviar um e-mail. 
public class EnviarEmailCommand implements Command {
    private final String destinatario;
    private final String assunto;
    private final String mensagem;

    public EnviarEmailCommand(String destinatario, String assunto, String mensagem) {
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.mensagem = mensagem;
    }

    @Override
    public void execute() {
        System.out.println("Executando comando: Enviando e-mail para " + destinatario + " com o assunto '" + assunto + "'.");
        // Lógica real de envio de e-mail aqui.
    }

    @Override
    public void undo() {
        System.out.println("Desfazendo comando: O e-mail para " + destinatario + " não pode ser desfeito.");
        // Implementação para desfazer, se possível.
    }
}