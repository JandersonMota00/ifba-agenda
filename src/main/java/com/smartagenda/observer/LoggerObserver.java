package com.smartagenda.observer;

// Observador que registra eventos em um log. [cite: 40]
public class LoggerObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("LOG: " + message);
    }
}