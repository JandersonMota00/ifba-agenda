package com.smartagenda.observer;

// Observador que notifica o usuário. [cite: 40]
public class NotificadorObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("NOTIFICAÇÃO: " + message);
    }
}