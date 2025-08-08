package br.com.observer;

import br.com.models.Tarefa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Essa classe implementa a interface observer, implementado a lógica do método update
public class InterfaceGrafica implements Observer {

    // Método que executa o envio do aviso, a partir da lógica estabelecida
    @Override
    public void update(Tarefa tarefa) {
        System.out.println("Tarefa " + tarefa.getNome() + " criada!");
        gerarHtml(tarefa.getNome());
    }

    // Para simular a geração de uma interface gráfica, ao salvar uma tarefa, é
    // gerado um HTML com o nome da tarefa
    private void gerarHtml(String nomeTarefa) {
        StringBuilder htmlBuilder = new StringBuilder();

        htmlBuilder.append("<html lang='pt-BR'>\n");
        htmlBuilder.append("<head>\n");
        htmlBuilder.append("<title>Tarefa Criada</title>\n");
        htmlBuilder.append("<meta charset='UTF-8'/>\n");
        htmlBuilder.append("</head>\n");
        htmlBuilder.append("<body style=\"font-family: Arial; text-align: center; padding: 20px;\">\n");
        htmlBuilder.append("    <h1>Tarefa Criada</h1>\n");
        htmlBuilder.append("    <h2>").append(nomeTarefa).append("</h2>\n");
        htmlBuilder.append("</body>\n");
        htmlBuilder.append("</html>");

        try {
            File arquivo = new File( nomeTarefa + ".html");
            FileWriter writer = new FileWriter(arquivo);
            writer.write(htmlBuilder.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
