package br.com.observer;

import br.com.models.Tarefa;

import javax.swing.*;

// Essa classe implementa a interface observer, implementado a lógica do método update
public class Notificador implements Observer {

    // Método que executa o envio do aviso, a partir da lógica estabelecida
    @Override
    public void update(Tarefa tarefa) {
        JOptionPane.showMessageDialog(null, "Tarefa " + tarefa.getNome() + " criada!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
    }
}
