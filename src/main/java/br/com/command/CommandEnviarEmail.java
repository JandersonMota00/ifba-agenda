package br.com.command;

// Essa classe esta implementando a interface Command e colocando lógica nos métodos
public class CommandEnviarEmail implements Command {
    private String destinatario;
    private String nomeTarefa;

    public CommandEnviarEmail(String destinatario, String nomeTarefa) {
        this.destinatario = destinatario;
        this.nomeTarefa = nomeTarefa;
    }

    @Override
    public String getNomeCommand() {
        return "Command de enviar email!";
    }

    // Método que executa o Command
    @Override
    public void executar() {
        System.out.println("COMMAND EMAIL: enviando e-mail para " + destinatario + " com a tarefa " + nomeTarefa);
    }

    // Método que desfaz uma execução de Command
    @Override
    public void desfazer() {
        System.out.println("COMMAND EMAIL: O e-mail para '" + destinatario + "' não foi enviado!");
    }
}
