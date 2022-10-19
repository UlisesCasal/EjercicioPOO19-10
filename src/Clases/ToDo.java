package Clases;

import java.util.ArrayList;
import java.util.List;

public class ToDo extends Observado {
    private List<Tarea> tareas = new ArrayList<>();

    public ToDo() {
    }

    public void agregarTarea(String titulo, String descripcion){
        Tarea tarea = new Tarea(descripcion, titulo);
        tareas.add(tarea);
    }

    public void marcarTareaComoHecha(Tarea tarea){
        tarea.darDeBaja();
    }

    public String mostrarTarea(int tarea){
        return tareas.get(tarea).mostrarTarea();
    }

    public String mostrarTareas(){
        String salida = "";
        for (Tarea t: tareas){
            salida += t.mostrarTarea();
        }
        return salida;
    }

    public Tarea getTarea(String titulo) {
        Tarea salida = null;
        for (Tarea t: tareas) {
            if (t.getTitulo().equals(titulo))
                salida = t;
        }
        return salida;
    }

    public void darDeBaja(int tarea){
        tareas.get(tarea).darDeBaja();
        notificar(tarea);
    }
}
