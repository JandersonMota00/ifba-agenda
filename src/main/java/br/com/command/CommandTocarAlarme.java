package br.com.command;

// Essa classe esta implementando a interface Command e colocando lógica nos métodos
public class CommandTocarAlarme implements Command {
    private String nomeTarefa;

    public CommandTocarAlarme(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    @Override
    public String getNomeCommand() {
        return "Command de adicionar alarme!";
    }

    // Método que executa o Command
    @Override
    public void executar() {
        System.out.println("COMMAND ALARME: adicionando alarme com a tarefa " + nomeTarefa);
    }

    // Método que desfaz uma execução de Command
    @Override
    public void desfazer() {
        System.out.println("COMMAND ALARME: O alarme não foi adicionado!");
    }
}
