package Clases;

import java.util.ArrayList;
import java.util.List;

public  abstract class Observado {
    private List<Observer> observers = new ArrayList<>();

    public void agregarObservador(Observer observer){
        observers.add(observer);
    }

    public void notificar(int numeroTarea){
        for (Observer o: observers){
            o.update(numeroTarea);
        }
    }


}
