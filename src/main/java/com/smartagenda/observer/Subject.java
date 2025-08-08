package com.smartagenda.observer;

// Interface para o "assunto" que será observado. 
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String message);
}